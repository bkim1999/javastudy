package ex03_Date_Time;

import java.sql.Date;
import java.sql.Timestamp;

public class Ex03_Java_sql_Date {

  public static void main(String[] args) {
    
    Date date = new Date(System.currentTimeMillis());
    
    System.out.println(date);
    
    Timestamp ts = new Timestamp(System.currentTimeMillis());
    System.out.println(ts);
  }

}
