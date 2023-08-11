package ex01_connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
  
  // 3. 접속 정보를 프로퍼티 파일에 저장
  //    1) .gitignore에 db.properties 추가 후 PUSH 
  //    2) db.properties 만들기
  public static void ex03() {
    
    BufferedReader reader = null;
    
    try {
      reader = new BufferedReader(new FileReader("src/db.properties"));
      
      Properties properties = new Properties();
      properties.load(reader);
      
      String url = properties.getProperty("url");
      String user = properties.getProperty("user");
      String password = properties.getProperty("password");
      
      System.out.println(url + user + password);
      
    } catch (IOException e) {
      System.out.println("프로퍼티 가져오기 실패");
    } finally {
      try {
        if(reader != null) reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  // 4. 최종 : Connection 객체 생성 후 반환
  public static Connection getConnection() {
    Connection con = null;
    
    try (BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"))) {
      // 1. 오라클 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver");
      
      // 2. 프로퍼티 가져오기
      Properties p = new Properties();
      p.load(reader);
      
      // 3. 드라이버와 프로퍼티 DB 접속
      con = DriverManager.getConnection(p.getProperty("url"),
                                        p.getProperty("user"),
                                        p.getProperty("password"));
      
    } catch (ClassNotFoundException e) {
      System.out.println("oracle.jdbc.OracleDriver 클래스 없음");
    } catch (IOException e) {
      System.out.println("프로퍼티 가져오기 실패");
    } catch (SQLException e) {
      System.out.println("DB 접속 실패");
    }
    
    return con;
  }
  
  public static void main(String[] args) throws Exception {
    Connection con = getConnection();
    System.out.println("Oracle 접속 성공");
    con.close();
  }
}
