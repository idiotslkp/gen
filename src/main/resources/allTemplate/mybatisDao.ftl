<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${paramMap.packageName}.dao.${table.modelName}Dao">
    <resultMap id="BaseResultMap" type="${table.modelName}">
	<#list table.columnList as column>
		<result property="${column.name}" column="${column.sqlName}" jdbcType="${column.type}"/>
	</#list>    
    </resultMap>

    <sql id="Base_Column_List">
	<#list table.columnList as column>
		A.${column.sqlName}	${column.name}<#if column_has_next >,</#if>
	</#list>    
    </sql>

    <insert id="save" parameterType="${table.modelName}">
        INSERT INTO ${table.tableName}(
	<#list table.columnList as column>
			${column.sqlName}<#if column_has_next >,</#if>
	</#list>
        ) VALUES (
	<#list table.columnList as column>
			<#noparse>#{</#noparse>${column.name},jdbcType=${column.type}<#noparse>}</#noparse><#if column_has_next >,</#if>
	</#list>
        )
    </insert>

	<update id="update" parameterType="${table.modelName}" >
        UPDATE ${table.tableName} 
        <set>
		<#list table.columnList as column>
	        <if test="@Ognl@isNotEmpty(${column.name})">
				${column.sqlName} = <#noparse>#{</#noparse>${column.name},jdbcType=${column.type}<#noparse>}</#noparse>,
			</if>
		</#list>	
		</set>	        
        WHERE UUID = <#noparse>#{uuid,jdbcType=VARCHAR}</#noparse>
	</update>
	
	<select id="get" parameterType="string" resultType="${table.modelName}">
		SELECT
		<include refid="Base_Column_List" /> 
		FROM ${table.tableName} A
		WHERE A.UUID = <#noparse>#{</#noparse>uuid, jdbcType=VARCHAR<#noparse>}</#noparse>
	</select>
	
	<select id="getModel" parameterType="${table.modelName}" resultType="${table.modelName}">
		SELECT
		<include refid="Base_Column_List" />
		FROM ${table.tableName} A
		<include refid="dynamicWhere" />
	</select>

	<sql id="dynamicWhere">
		<where>
		<#list table.columnList as column>
	        <if test="@Ognl@isNotEmpty(${column.name})">
				AND A.${column.sqlName} = <#noparse>#{</#noparse>${column.name},jdbcType=${column.type}<#noparse>}</#noparse>
			</if>
		</#list>
		</where>
	</sql>
	
	<select id="getCount" parameterType="${table.modelName}" resultType="int">
		SELECT COUNT(1) FROM ${table.tableName} A <include refid="dynamicWhere" />
	</select>
	
	<select id="getList" resultMap="BaseResultMap" parameterType="${table.modelName}">
		SELECT 
			<include refid="Base_Column_List"/>  
		FROM ${table.tableName} A
			<include refid="dynamicWhere" />
		ORDER BY A.CREATE_DATE desc
	</select>
	
</mapper>
