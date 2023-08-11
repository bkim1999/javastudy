package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.ContactDto;

/* 
 * DAO
 * Database Access Object
 * 데이터베이스에 접근, 쿼리문을 실행, 실행결과를 받음
 * 하나의 객체만 만들어 공유하는 싱글톤 패턴
 */

/* Singleton Pattern
 * 하나의 객체만 만들어 해당 객체를 사용할 수 있도록 처리한다.
 * 객체 생성이 불가능하도록 생성자 호출할 수 없게 한다.
 */

public class ContactDao {

  private static ContactDao dao = new ContactDao();

  private ContactDao() {

  }

  public static ContactDao getDao() {
    return dao;
  }

  private Connection con;
  private PreparedStatement ps;
  private ResultSet rs;

  private Connection getConnection() {

    try (BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"))) {

      Class.forName("oracle.jdbc.OracleDriver");

      Properties p = new Properties();
      p.load(reader);

      con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password"));

    } catch (ClassNotFoundException e) {
      System.out.println("oracle.jdbc.OracleDriver를 찾을 수 없다.");
    } catch (IOException e) {
      System.out.println("db.properties 파일을 읽을 수 없다.");
    } catch (SQLException e) {
      System.out.println("DB 접속에 실패했다.");
    }

    return con;

  }

  private void close() {
    try {
      if (rs != null)
        rs.close();
      if (ps != null)
        ps.close();
      if (con != null)
        con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 삽입 메소드<br>
   * 
   * @param contactDto 삽입할 연락처 정보(name, tel, email, address)
   * @return insertCount 삽입된 행의 개수
   */
  public int insert(ContactDto contactDto) {
    
    System.out.println("Dao::insert(" + contactDto + ")");

    int insertCount = 0;

    try {

      con = getConnection();

      String sql = "INSERT INTO CONTACT_T(CONTACT_NO, NAME, TEL, EMAIL, ADDRESS, CREATED_AT)";
      sql += " VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?, ?, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'))";
      ps = con.prepareStatement(sql);
      ps.setString(1, contactDto.getName());
      ps.setString(2, contactDto.getTel());
      ps.setString(3, contactDto.getEmail());
      ps.setString(4, contactDto.getAddress());

      insertCount = ps.executeUpdate();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }

    return insertCount;
  }

  /**
   * 수정 메소드<br>
   * 
   * @param contactDto 수정할 연락처 정보(contact_no, name, tel, email, address)
   * @return updateCount 수정된 행의 개수
   */
  public int update(ContactDto contactDto) {
    
    System.out.println("Dao::update(" + contactDto + ")");
    
    int updateCount = 0;

    try {

      con = getConnection();

      String sql = "UPDATE CONTACT_T SET NAME = ?, TEL = ?, EMAIL = ?, ADDRESS = ? WHERE CONTACT_NO = ?";
      String updateContent = "";
      if(contactDto.getName().isEmpty() == false)
        updateContent += "NAME = ?";
      
      ps = con.prepareStatement(sql);
      
      ps.setString(1, contactDto.getName());
      ps.setString(2, contactDto.getTel());
      ps.setString(3, contactDto.getEmail());
      ps.setString(4, contactDto.getAddress());
      ps.setInt(5, contactDto.getContact_no());

      updateCount = ps.executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }

    return updateCount;

  }

  /**
   * 삭제 메소드<br>
   * 
   * @param contactNo 삭제할 연락처 번호
   * @return deleteCount 삭제된 행의 개수, 1이면 삭제 성공, 0이면 삭제 실패
   */
  public int delete(int contact_no) {

    System.out.println("Dao::delete(" + contact_no + ")");

    int deleteCount = 0;

    try {

      con = getConnection();

      String sql = "DELETE FROM CONTACT_T WHERE CONTACT_NO = ?";
      ps = con.prepareStatement(sql);
      ps.setInt(1, contact_no);

      deleteCount = ps.executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }

    return deleteCount;

  }

  /**
   * 전체 조회 메소드<br>
   * 
   * @return 조회된 모든 연락처 정보(ContactDto)
   */
  public List<ContactDto> selectList() {

    System.out.println("Dao::selectList()");
    
    List<ContactDto> list = new ArrayList<ContactDto>();

    try {

      con = getConnection();

      String sql = "SELECT CONTACT_NO, NAME, TEL, EMAIL, ADDRESS, CREATED_AT FROM CONTACT_T ORDER BY CONTACT_NO ASC";
      ps = con.prepareStatement(sql);

      rs = ps.executeQuery();

      while (rs.next()) {
        ContactDto contactDto = new ContactDto();
        contactDto.setContact_no(rs.getInt("CONTACT_NO"));
        contactDto.setName(rs.getString("NAME"));
        contactDto.setTel(rs.getString("TEL"));
        contactDto.setEmail(rs.getString("EMAIL"));
        contactDto.setAddress(rs.getString("ADDRESS"));
        contactDto.setCreated_at(rs.getString("CREATED_AT"));
        list.add(contactDto);
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }

    return list;
  }

  public ContactDto selectContactByNo(int contact_no) {

    System.out.println("Dao::selectContactByNo(" + contact_no + ")");
    
    ContactDto contactDto = null;

    try {
      
      con = getConnection();

      String sql = "SELECT CONTACT_NO, NAME, TEL, EMAIL, ADDRESS, CREATED_AT FROM CONTACT_T WHERE CONTACT_NO = ?";
      ps = con.prepareStatement(sql);
      ps.setInt(1, contact_no);

      rs = ps.executeQuery();

      if (rs.next()) {
        contactDto = new ContactDto();
        contactDto.setContact_no(rs.getInt(1));
        contactDto.setName(rs.getString(2));
        contactDto.setTel(rs.getString(3));
        contactDto.setEmail(rs.getString(4));
        contactDto.setAddress(rs.getString(5));
        contactDto.setCreated_at(rs.getString(6));
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      close();
    }

    return contactDto;

  }

}
