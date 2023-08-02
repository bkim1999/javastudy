package ex03_Date_Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_SimpleDateFormat {

  public static void main(String[] args) {
    
    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MMM dd일 E요일 a hh시 mm분 ss초. 김범철, 집에 가다.");
    
    String strDate = sdf.format(date);
    
    System.out.println(strDate);
    
  }

}
