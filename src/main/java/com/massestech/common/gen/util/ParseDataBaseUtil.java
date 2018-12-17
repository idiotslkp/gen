package com.massestech.common.gen.util;
//
//import com.massestech.common.gen.model.Column;
//import com.massestech.common.gen.model.Conf;
//import com.massestech.common.gen.model.FieldType;
//import com.massestech.common.gen.model.Table;
//
//import java.columu.Connection;
//import java.columu.ResultSet;
//import java.columu.SQLException;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
///**
// * 解析数据库的工具类
// * @copyright 锋锐科技 Copyright (c) 2017
// * @since 2017-1-13
// * @author LKP
// * @version 1.0
// *
// */
//public class ParseDataBaseUtil {
//
//	public static Table parseDataBaseTable(Conf conf) throws Exception {
//        // 定义表格
//        Table table = new Table();
//		table.setComment(conf.getParamMap().get("comment"));	// 表的注释
//		table.setModelName(conf.getParamMap().get("modelName"));// model名称.因为pdm需要,所以这里有冗余.
//		table.setTableName(conf.getParamMap().get("tableName"));// 表名
//		setColumnList(table, conf); // 设置列信息
//
//		return table;
//
//	}
//
//	// 其他数据库不需要这个方法 oracle和db2需要
//	private static String getSchema(Connection conn) throws Exception {
//		String schema;
//		schema = conn.getMetaData().getUserName();
//		if ((schema == null) || (schema.length() == 0)) {
//			throw new Exception("ORACLE数据库模式不允许为空");
//		}
//		return schema.toUpperCase().toString();
//
//	}
//
//	/**
//	 * 设置列的信息
//	 * @param table
//	 * @param conf
//	 * @throws SQLException
//	 */
//	private static void setColumnList(Table table, Conf conf) throws Exception {
//		 // 设置字段信息
//        Connection conn = JdbcUtil.getConn();
//        // 获取指定表的信息
//		ResultSet rs = conn.getMetaData().getColumns(null, getSchema(conn), conf.getParamMap().get("tableName").toUpperCase(), "%");
//
//		// 定义列
//        Column column = null;
//        Set<String> importClassSet = new HashSet<String>();	// 需要导入的jar包
//        List<Column> columnList = new ArrayList<Column>();	// 列属性
//
//        while (rs.next()) {
//			column = new Column();
//			String sqlName = rs.getString("COLUMN_NAME"); // 数据库字段名称
//			String name = getModelFieldBySqlFiledName(sqlName); // 根据数据库字段名,获取model的字段
//			String comment = rs.getString("REMARKS"); // 字段注释
//			String sqltype = rs.getString("TYPE_NAME"); // 数据库字段类型
//			column.setName(name);// model属性名
//			column.setSqlName(sqlName);// 对应的数据库字段名
//			column.setComment(comment);// 字段注释
//			FieldType fieldType = FieldType.getFieldType(conf, sqltype); // 从map中获取到对应的字段类型model
//
//			column.setType(fieldType.getMybatisFieldType());// mybatis对应的字段类型
//
//			column.setFileType(fieldType.getModelFieldType());	// 设置model的类型
//
//			// 判断是否有需要导入的jar包,如果有的话,那么就将需要导入的jar包,加到对应的表之中
//			if (null != fieldType.getImportClass() && !"".equals(fieldType.getImportClass())) {
//				importClassSet.add(fieldType.getImportClass());
//			}
//			columnList.add(column);
//		}
//        // 没有列,那么说明表是不存在的或者说没有列.
//        if (columnList.size() == 0) {
//        	System.err.println("想要查询的表,不存在于数据库中,或者该表,没有列,因此本次无法生成代码.");
//			System.exit(0);
//        }
//
//		table.setImportClassSet(importClassSet);	// 设置需要导入的jar包
//		table.setColumnList(columnList);	// 设置列的属性信息
//	}
//
//	/**
//	 * 根据数据库字段名,获取model的字段,后续如果要求不一样,那么就修改这个方法.
//	 *
//	 * @author LKP
//	 * @Date 2017-1-18
//	 * @param sqlName
//	 * @return
//	 */
//	private static String getModelFieldBySqlFiledName(String sqlName) {
//		String name = "";
//		String names[] = sqlName.split("_"); // C_TYPE_ID或者TYPE_ID
//		// 转换为   typdId.
//		boolean flag = names[0].length() == 1;
//		for (int i = 0; i < names.length; i++) {
//			// TYPE_ID
//			if (i == 0 && !flag) {
//				name = names[0].toLowerCase();
//			} else if (i == 0 && flag) {
//				// C_TYPE_ID,不要前缀C.
//			} else {
//				name += names[1].substring(0,1).toUpperCase() + names[1].substring(1).toLowerCase();
//			}
//		}
//		return name;
//	}
//
//}
