package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainWrapper {
  // 1. oracle.jdbc.OracleDriver 로드
  public static void ex01() {
    try {
      Class.forName("oracle.jdbc.OracleDriver");
    } catch (ClassNotFoundException e) {
      System.out.println("oracle.jdbc.OracleDriver 클래스 없음");
    }
  }
 
  // 2. java.sql.Connection 객체 생성 (DB 접속 생성)
  public static void ex02() {
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "GD";
    String password = "1111";
    
    Connection con = null;
    
    try {
      con = DriverManager.getConnection(url, user, password);
      System.out.println("DB 접속 성공");
    } catch (SQLException e) {
      System.out.println("DB 접속 실패");
    } finally {
      try {
        if(con != null) con.close();
        System.out.println("DB 접속 닫기 성공");
      } catch (SQLException e) {
        System.out.println("DB 접속 닫기 실패");
      }
    }
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }

}
