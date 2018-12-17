


    //--------------以下内容服务消费者需要复制---------------------------分割线,不要复制O(∩_∩)O哈哈~---------

    @Bean
    public I${table.modelName}Api ${table.modelName?uncap_first}Api() {
        return buildBean(I${table.modelName}Api.class);
    }


    //--------------以下内容服务提供者需要复制---------------------------分割线,不要复制O(∩_∩)O哈哈~---------

    <bean id="hsf${table.modelName}Api" class="<#noparse>${yingzi.service.provider}</#noparse>" init-method="init">
        <property name="serviceInterface" value="com.yingzi.center.growing.api.I${table.modelName}Api" />
        <property name="serviceVersion" value="<#noparse>${yingzi.service.version}</#noparse>" />
        <property name="serviceGroup" value="<#noparse>${yingzi.service.group}</#noparse>" />
        <property name="target" ref="${table.modelName?uncap_first}Api" />
    </bean>





