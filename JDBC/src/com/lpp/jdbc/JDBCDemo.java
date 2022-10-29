package com.lpp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Author LPP
 * @Description //JDBC快速入门
 * @Date $ $
 * @return $
 **/
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //1、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2、获取连接
        String url="jdbc:mysql://localhost:3306/shoppingweb?useSSL=false&serverTimezone=GMT";
        String password="root";
        String username="root";
        Connection conn=DriverManager.getConnection(url,username,password);

        //3、定义sql
        String sql="update tb_user set username='zqq' where id=3";

        //4、获取执行sql的对象
        Statement stmt=conn.createStatement();


        //5、执行sql
        int count=stmt.executeUpdate(sql);//返回受影响的行数

        //6、处理结果
        System.out.println(count);

        //7、释放资源
        stmt.close();
        conn.close();



    }
}
