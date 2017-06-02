package com.liang.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by CLiang on 2017/6/2.
 */
public class DB {
    private Connection con;      //声明一个Connection对象
    private PreparedStatement pstm; //声明一个PreparedStatement对象
    private String user="sa";       //登录sql server的默认系统管理员名
    private String password="changliang";   //登录数据库密码
    private String className="com.microsoft.sqlserver.jdbc.SQLServerDriver";    //数据库驱动类路径
    private String url="jdbc:sqlserver://localhost:1433;DatabaseName=db_CityInfo";    //数据库URL

    //DB类的构造方法
    public DB() {
        try{                                //使用try-catch语句捕获加载数据库驱动时可能发生的异常
            Class.forName(className);       //加载数据库驱动
        }catch (ClassNotFoundException e){
            System.out.println("加载数据库驱动失败!");
            e.printStackTrace();            //输出异常信息
        }
    }

    //创建数据库连接
    public Connection getCon() {
        try {
            con=DriverManager.getConnection(url,user,password);     //建立连接
        } catch (SQLException e) {
            System.out.println("创建数据库连接失败！");
            con=null;
            e.printStackTrace();
        }
        return con;
    }


}
