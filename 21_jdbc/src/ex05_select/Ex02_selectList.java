 package ex05_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DB_Connect;
import dto.UserDto;

public class Ex02_selectList {

  public static void main(String[] args) {
    
    Connection con = null;
    PreparedStatement ps = null;
    
    // SELECT 검색 결과
    ResultSet rs = null;
    
    
    try {
      con = DB_Connect.getConnection();
      
      String sql = "";
      sql += "SELECT USER_NO, USER_ID, USER_NAME, JOINED_AT";
      sql += "  FROM USER_T";
      
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      
      List<UserDto> users = new ArrayList<UserDto>();
      while(rs.next()) {
        UserDto user = new UserDto();
        user.setUser_no(rs.getInt("USER_NO"));
        user.setUser_id(rs.getString("USER_ID"));
        user.setUser_name(rs.getString("USER_NAME"));
        user.setJoined_at(rs.getDate("JOINED_AT"));
        users.add(user);
      }
      
      for(UserDto user : users) {
        System.out.println(user);
      }
      
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
