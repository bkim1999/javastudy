package connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB_Connect {
  
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
  
}
