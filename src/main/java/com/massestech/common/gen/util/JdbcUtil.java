package com.massestech.common.gen.util;
//
//import java.columu.Connection;
//import java.columu.DriverManager;
//import java.columu.SQLException;
//import java.util.Map;
//
///**
// * jdbc工具类
// *
// * @copyright 锋锐科技 Copyright (c) 2016
// * @since 2016-3-18
// * @author LKP
// * @version 1.0
// *
// */
//public class JdbcUtil {
//
//
//	public static Connection conn;
//
//	public static Connection getConn() {
//		if (null == conn) {
//			Map<String, String> paramMap = TemplateUtil.getConf().getParamMap();
//
//			String driver = paramMap.get("driver");
//			String url = paramMap.get("url");
//			String username = paramMap.get("username");
//			String password = paramMap.get("password");
//			try {
//				Class.forName(driver); //classLoader,加载对应驱动
//				conn = DriverManager.getConnection(url, username, password);
//			} catch (ClassNotFoundException e) {
//				// e.printStackTrace();
//				System.err.println("缺少相关的数据库驱动包....." + e);
//				System.exit(0);
//			} catch (SQLException e) {
//				System.err.println("数据库连接失败,请检查conf.xml配置....." + e);
//				System.exit(0);
////				e.printStackTrace();
//			}
//		}
//	    return conn;
//	}
//
//}
