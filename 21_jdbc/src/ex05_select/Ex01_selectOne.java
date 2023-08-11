package ex05_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class Ex01_selectOne {

  public static void main(String[] args) {

    // 조회할 사용자 번호(USER_NO) 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("조회할 USER_NO >>> ");
    int user_no = sc.nextInt();
    sc.nextLine();
    sc.close();
    
    Connection con = null;
    PreparedStatement ps = null;
    
    // SELECT 검색 결과
    ResultSet rs = null;
    
    UserDto user = null;
    
    try {
      con = DB_Connect.getConnection();
      String sql = "";
      sql += "SELECT USER_NO, USER_ID, USER_NAME, JOINED_AT";
      sql += "  FROM USER_T";
      sql += " WHERE USER_NO = ?";
      
      ps = con.prepareStatement(sql);
      ps.setInt(1, user_no);
      rs = ps.executeQuery();
      if(rs.next()) {
        user = new UserDto();
        user.setUser_no(rs.getInt("USER_NO"));
        user.setUser_id(rs.getString("USER_ID"));
        user.setUser_name(rs.getString("USER_NAME"));
        user.setJoined_at(rs.getDate("JOINED_AT"));
      }  
      
      System.out.println(user);
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (con != null) con.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}
