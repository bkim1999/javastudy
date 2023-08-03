package ex01_mkdirs;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class MainWrapper {

  public static void main(String[] args) {

    // SimpleDateFormat
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH");
    String strDate = sdf.format(date);
    
    File dir = new File("C:/" + strDate);
    if(!dir.exists()) {
      dir.mkdirs();
      System.out.println("C:/" + strDate + " 생성됨.");
    }
    
    // LocalDateTime
    LocalDateTime ldt = LocalDateTime.now();
    int year = ldt.getYear();
    int month = ldt.getMonthValue();
    int day = ldt.getDayOfMonth();
    int hour = ldt.getHour();
    
    StringBuilder sb = new StringBuilder();
    sb.append("C:/");
    sb.append(String.format("%02d", year));
    sb.append("/");
    sb.append(String.format("%02d", month));
    sb.append("/");
    sb.append(String.format("%02d", day));
    sb.append("/");
    sb.append(String.format("%02d", hour));
    File dir2 = new File(sb.toString());
    if(!dir2.exists()) {
      dir2.mkdirs();
    }
    

  }

}
