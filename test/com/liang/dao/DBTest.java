package com.liang.dao;

import static org.junit.Assert.*;


/**
 * Created by CLiang on 2017/6/2.
 */
public class DBTest {
    private DB db;

    @org.junit.Before
    public void setUp() throws Exception {
       db=new DB();
    }

    @org.junit.Test
    public void getCon() throws Exception {
       if(db.getCon()!=null) {
           System.out.println("数据库连接成功！");
       }

    }

}