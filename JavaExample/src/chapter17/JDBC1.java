package chapter17;
/*
예제 17-1 : boostdb의 데이터베이스 연결하는 JDBC 프로그램 작성
JDBC를 이용하여 boostdb 데이터베이스에 연결하는 자바 응용프로그램을 작성하라.
(연결만 확인)
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC1 {
    private static String URL = "jdbc:mysql://localhost:3306/<DB이름>?useSSL=false";
    private static String USER = "<사용자명>";
    private static String PW = "<패스워드>";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PW);
            System.out.println("DB 연결 완료");
        } catch (ClassNotFoundException e){
            System.out.println("JDBC 드라이버 로드 에러");
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }
}
