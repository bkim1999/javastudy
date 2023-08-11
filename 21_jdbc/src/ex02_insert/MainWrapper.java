package ex02_insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("USER_ID >>> ");
    String user_id = sc.next();
    sc.nextLine();
    System.out.print("USER_NAME >>> ");
    String user_name = sc.nextLine();
    sc.close();
    
    UserDto user = new UserDto();
    user.setUser_id(user_id);
    user.setUser_name(user_name);
    
    // Connection 객체 선언 (데이터베이스 접속)
    Connection con = null;
    
    // PreparedStatement 객체 선언 (쿼리문 실행)
    PreparedStatement ps = null;
    
    try {
      
      // Connection 객체 생성
      con = DB_Connect.getConnection();
      
      // 쿼리문
      String sql = "INSERT INTO USER_T (USER_NO, USER_ID, USER_NAME, JOINED_AT)";
      sql += "VALUES(USER_SEQ.NEXTVAL, ?, ?, SYSDATE)";
      
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문에 변수 삽입
      ps.setString(1, user.getUser_id());
      ps.setString(2, user.getUser_name());
      
      // 쿼리문 실행 : INSERT 된 행의 개수 반환
      int insertResult = ps.executeUpdate();
      
      // 결과
      System.out.println(insertResult + "개의 행이 삽입되었습니다.");
      
      // con.setAutoCommit(true); 기본값임
      
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
