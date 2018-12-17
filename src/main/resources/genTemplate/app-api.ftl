<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="${table.modelName?uncap_first}Api" <#noparse>class="${yingzi.service.consumer}"</#noparse>
          init-method="init">
        <property name="interfaceName" value="${packageName}.api.I${table.modelName}Api" />
        <property name="version" value="<#noparse>${yingzi.service.version}</#noparse>" />
        <property name="group" value="<#noparse>${yingzi.service.group}</#noparse>" />
        <property name="clientTimeout" value="60000" />
    </bean>

</beans>