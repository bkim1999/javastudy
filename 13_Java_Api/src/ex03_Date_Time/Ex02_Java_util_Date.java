package ex03_Date_Time;

import java.util.Date;

public class Ex02_Java_util_Date {
  
  public static void main(String[] args) {
    
    Date date = new Date();
    
    System.out.println(date);

    Date date2 = new Date(System.currentTimeMillis());
    
    System.out.println(date2);
  }
}
