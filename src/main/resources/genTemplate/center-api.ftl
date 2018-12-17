<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="hsf${table.modelName}Api" class="<#noparse>${yingzi.service.provider}</#noparse>" init-method="init">
        <property name="serviceInterface" value="${packageName}.api.I${table.modelName}Api" />
        <property name="serviceVersion" value="<#noparse>${yingzi.service.version}</#noparse>" />
        <property name="serviceGroup" value="<#noparse>${dtyunxi.registry.group}</#noparse>" />
        <property name="target" ref="${table.modelName?uncap_first}Api" />
    </bean>

</beans>