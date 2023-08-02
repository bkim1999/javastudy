package ex03_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex06_LocalDateTime {
  
  public static void ex01() {
    LocalDate date1 = LocalDate.now();
    System.out.println(date1);
    LocalDate date2 = LocalDate.of(2023,  7, 31);
    System.out.println(date2);
    LocalDate date3 = LocalDate.parse("2023-07-31");
    System.out.println(date3);
  }
  
  public static void ex02() {
    LocalTime time1 = LocalTime.now();
    System.out.println(time1);
    LocalTime time2 = LocalTime.of(15, 25, 30);
    System.out.println(time2);
    LocalTime time3 = LocalTime.parse("04:11:11");
    System.out.println(time3);
  }
  
  public static void ex03() {
    LocalDateTime  dtime1 = LocalDateTime.now();
    System.out.println(dtime1);
    LocalDateTime dtime2 = LocalDateTime.of(2023, 7,  31, 15, 25, 30);
    System.out.println(dtime2);
    LocalDateTime dtime3 = LocalDateTime.parse("2023-07-31T04:11:11");
    System.out.println(dtime3);
  }

  public static void ex04() {
    LocalDateTime  dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyymmdd");
    dateTime = LocalDateTime.parse("2023-07-31 04:11:11", formatter);
    
    System.out.println(dateTime);
  }
  
  public static void ex05() {
    LocalDateTime  dateTime = LocalDateTime.now();
    int year = dateTime.getYear();
    int month = dateTime.getMonthValue();
    int day = dateTime.getDayOfMonth();
    
    System.out.println(year);
  }
  
  public static void main(String[] args) {

    ex04();
  }

}
