package ex03_Date_Time;

import java.util.Calendar;
import java.util.Date;

public class Ex05_Calenar {
  
  public static void ex01() {
    
    Calendar calendar = Calendar.getInstance();
    
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    int weekNo = calendar.get(Calendar.DAY_OF_WEEK);
    System.out.println(year + " " + month + " " + day + " " + weekNo);
    
  }
  
  public static void ex02() {
    
    Calendar calendar = Calendar.getInstance();
    
    calendar.set(Calendar.YEAR, 2022);
    
    calendar.add(Calendar.MONTH, -1);
    
    long timestamp = calendar.getTimeInMillis();
    
    Date date = calendar.getTime();
    System.out.println(date);
  }
  public static void main(String[] args) {

    ex02();
    
  }

}
