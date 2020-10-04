package org.edwith.webbe.guestbook.util;

import java.sql.*;

public class DBUtil {
    private static String dbUrl = "jdbc:mysql://localhost:3306/backend?useSSL=false";
    private static String dbUser = "root";
    private static String dbPw = "dong0117";

//    private static String dbUrl = "jdbc:mysql://localhost:[PORT_NUMBER]/[DB_NAME]?useSSL=false";
//    private static String dbUser = "[USER]";
//    private static String dbPw = "[PASSWORD]";

    public static Connection getConnection(){
        return getConnection(dbUrl, dbUser, dbPw);
    }

    public static Connection getConnection(String dbURL, String dbId, String dbPassword){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
            return conn;
        }catch(Exception ex){
            throw new RuntimeException("Connection Error");
        }
    }
}
