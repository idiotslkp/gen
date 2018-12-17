<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF8">
<title></title>
<style type="text/css">
#container {
	margin: 8px;
}

.param-table {
	background: #E6E6E6;
	border: 12px solid #FFF;
	margin: 12px 0;
	border-collapse: collapse;
}

.param-table th {
	background: gray;
	color: #FFF;
	font-size: 14px;
	font-weight: bold;
	text-align: center;
	border: 1px solid #FFF;
	padding: 5px;
}

.param-table td {
	border-collapse: collapse;
	border: 1px solid #FFF;
	font-size: 12px;
	padding: 5px;
}

.param-table .th-name {
	
}

.param-table .th-identifier {
	min-width: 140px;
}

.param-table .th-type {
	min-width: 100px;
}

.param-table .th-remark {
	min-width: 200px;
}

.param-table .td-name {
	min-width: 170px;
}

.param-table .td-identifier {
	
}

.param-table .td-type {
	color: #990000;
}

.param-table .td-remark {
	color: #666;
}

.param-table .tr-level-1 {
	background: #F5F5F5;
}

.param-table .tr-level-1 .td-identifier {
	padding-left: 5px;
}

.param-table .tr-level-2 {
	background: #E6E6E6;
}

.param-table .tr-level-2 .td-identifier {
	padding-left: 15px;
}

.param-table .tr-level-3 {
	background: #CCCCCC;
}

.param-table .tr-level-3 .td-identifier {
	padding-left: 25px;
}

.param-table .tr-level-4 {
	background: #E6E6E6;
}

.param-table .tr-level-4 .td-identifier {
	padding-left: 35px;
}

.param-table .tr-level-5 {
	background: #CCCCCC;
}

.param-table .tr-level-5 .td-identifier {
	padding-left: 45px;
}

.param-table .tr-level-6 {
	background: #E6E6E6;
}

.param-table .tr-level-6 .td-identifier {
	padding-left: 55px;
}

.param-table .tr-level-7 {
	background: #CCCCCC;
}

.param-table .tr-level-7 .td-identifier {
	padding-left: 65px;
}

.param-table .tr-level-8 {
	background: #E6E6E6;
}

.param-table .tr-level-8 .td-identifier {
	padding-left: 75px;
}

.param-table .tr-level-9 {
	background: #CCCCCC;
}

.param-table .tr-level-9 .td-identifier {
	padding-left: 85px;
}

.param-table .tr-level-10 {
	background: #E6E6E6;
}

.param-table .tr-level-10 .td-identifier {
	padding-left: 95px;
}

.param-table .tr-level-11 {
	background: #CCCCCC;
}

.param-table .tr-level-11 .td-identifier {
	padding-left: 105px;
}

.param-table .tr-level-12 {
	background: #E6E6E6;
}

.param-table .tr-level-12 .td-identifier {
	padding-left: 115px;
}

.param-table .tr-level-13 {
	background: #CCCCCC;
}

.param-table .tr-level-13 .td-identifier {
	padding-left: 125px;
}
</style>
</head>
<body>
	<div id="container">
		<div class="module">
			<h1>1&nbsp;${table.comment}</h1>
			<div class="page">
				<h2>1.1&nbsp;添加</h2>
				<div class="action">
					<table class="param-table">
						<tr class="tr-level-1">
							<td class="td-name">接口url</td>
							<td class="td-identifier">api/${table.modelName?uncap_first}/save</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法名称</td>
							<td class="td-identifier">save</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法描述</td>
							<td class="td-identifier">添加</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">所需参数</td>
							<td class="td-identifier">
								<code>
								{ <br/>
									<#list table.columnList as column>
									<#if column.name != "id" && column.name != "isValid" && column.name != "createTime">
									&nbsp "${column.name}":""<#if column_has_next >,</#if> // ${column.comment} <br/>
									</#if>
									</#list>
								}
								</code>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">返回结果</td>
							<td class="td-identifier">
								<span>
								{ <br/>
									&nbsp "status":200,<br/>
									&nbsp "desc":""<br/>
								}
								</span>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">备 注</td>
							<td class="td-identifier"></td>
						</tr>
					</table>
				</div>
				<h2>1.2&nbsp;修改</h2>
				<div class="action">
					<table class="param-table">
						<tr class="tr-level-1">
							<td class="td-name">接口url</td>
							<td class="td-identifier">api/${table.modelName?uncap_first}/update</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法名称</td>
							<td class="td-identifier">update</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法描述</td>
							<td class="td-identifier">添加</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">所需参数</td>
							<td class="td-identifier">
								<code>
								{ <br/>
									<#list table.columnList as column>
									<#if column.name != "createTime">
									&nbsp "${column.name}":""<#if column_has_next >,</#if> // ${column.comment} <br/>
									</#if>
									</#list>
								}
								</code>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">返回结果</td>
							<td class="td-identifier">
								<span>
								{ <br/>
									&nbsp "status":200,<br/>
									&nbsp "desc":""<br/>
								}
								</span>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">备 注</td>
							<td class="td-identifier"></td>
						</tr>
					</table>
				</div>
				<h2>1.3&nbsp;根据id获取单条数据</h2>
				<div class="action">
					<table class="param-table">
						<tr class="tr-level-1">
							<td class="td-name">接口url</td>
							<td class="td-identifier">api/${table.modelName?uncap_first}/getById</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法名称</td>
							<td class="td-identifier">getById</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法描述</td>
							<td class="td-identifier">根据id获取详细信息</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">所需参数</td>
							<td class="td-identifier">
								<code>
								{ <br/>
									&nbsp "id": "", // id，必须要有 <br/>
								}
								</code>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">返回结果</td>
							<td class="td-identifier">
								<span>
								{ <br/>
								    &nbsp"status": 200, <br/>
								    &nbsp"desc": "请求成功!" <br/>
								    &nbsp"respData": { <br/>
									    <#list table.columnList as column>
										&nbsp&nbsp "${column.name}":""<#if column_has_next >,</#if> // ${column.comment} <br/>
										</#list>
								    &nbsp} <br/>
								}
								</span>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">备 注</td>
							<td class="td-identifier"></td>
						</tr>
					</table>
				</div>
				
				<h2>1.4&nbsp;获取所有数据</h2>
				<div class="action">
					<table class="param-table">
						<tr class="tr-level-1">
							<td class="td-name">接口url</td>
							<td class="td-identifier">api/${table.modelName?uncap_first}/getList</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法名称</td>
							<td class="td-identifier">getList</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法描述</td>
							<td class="td-identifier">获取所有数据</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">所需参数</td>
							<td class="td-identifier">
								<code>
								{ <br/>
								    <#list table.columnList as column>
									<#if column.name != "id">
									&nbsp "${column.name}":""<#if column_has_next >,</#if> // ${column.comment} <br/>
									</#if>
									</#list>
								}
								</code>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">返回结果</td>
							<td class="td-identifier">
								<span>
								{ <br/>
								    &nbsp"desc": "请求成功!", <br/>
								    &nbsp"data": [ <br/>
								        &nbsp{ <br/>
								            <#list table.columnList as column>
											&nbsp&nbsp "${column.name}":""<#if column_has_next >,</#if> // ${column.comment} <br/>
											</#list>
								        &nbsp} <br/>
								    ] <br/>
								}
								</span>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">备 注</td>
							<td class="td-identifier">参数可选</td>
						</tr>
					</table>
				</div>
				
				<h2>1.5&nbsp;分页</h2>
				<div class="action">
					<table class="param-table">
						<tr class="tr-level-1">
							<td class="td-name">接口url</td>
							<td class="td-identifier">api/${table.modelName?uncap_first}/getPage</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法名称</td>
							<td class="td-identifier">getPage</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">方法描述</td>
							<td class="td-identifier">分页查询</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">所需参数</td>
							<td class="td-identifier">
								<code>
								{ <br/>
								    &nbsp"pageIndex": "1", // 页数 <br/>
								    &nbsp"pageSize": "10", // 行数 <br/>
								    <#list table.columnList as column>
									<#if column.name != "id">
									&nbsp"${column.name}":""<#if column_has_next >,</#if> // ${column.comment} <br/>
									</#if>
									</#list>
								}
								</code>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">返回结果</td>
							<td class="td-identifier">
								<span>
								{ <br/>
								    &nbsp"status": 200, <br/>
								    &nbsp"desc": "请求成功!", <br/>
									&nbsp"pager":{<br/>
									         &nbsp&nbsp "pageCount":,	//当前分页  <br/>
									         &nbsp&nbsp "pageSize":,   //分页大小  <br/>
											 &nbsp&nbsp "itemCount":,  //分页总数量<br/>
											 &nbsp&nbsp "pageIndex":   //资源总数量<br/>
									&nbsp},<br/>
								    &nbsp"data": [ <br/>
								        &nbsp{ <br/>
								            <#list table.columnList as column>
											&nbsp&nbsp "${column.name}":""<#if column_has_next >,</#if> // ${column.comment} <br/>
											</#list>
									    &nbsp} <br/>
								    ] <br/>
								}
								</span>
							</td>
						</tr>
						<tr class="tr-level-1">
							<td class="td-name">备 注</td>
							<td class="td-identifier">参数可选</td>
						</tr>
					</table>
				</div>
			
			</div>
		</div>
	</div>
</body>
</html>
