package ex02_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainWrapper {
  
  public static void ex01() {
     
    // ArrayList 의 인터페이스  List  선언
    List<String> season;
    
    season = new ArrayList<String>();
    
    season.add("여름");
    season.add("가을");
    season.add("겨을");
    season.add(0, "봄");
    
    System.out.println(season.get(0));
    System.out.println(season.get(1));
    System.out.println(season.get(2));
    System.out.println(season.get(3));
    
  }

  public static void ex02() {
    
    List<String> hobbies = new ArrayList<String>();
    
    hobbies.add("김민지");
    hobbies.add("팜하니");
    hobbies.add("다니엘");    
    hobbies.add("강해린");    
    hobbies.add("이혜인");    
    
    System.out.println(hobbies.size());
    
    System.out.println(hobbies.get(hobbies.size() - 1));
    
    for(int i = 0; i < hobbies.size(); i++) {
      System.out.println(hobbies.get(i));
    }
    
    for(int i = 0, length = hobbies.size(); i < length; i++) {
      System.out.println(hobbies.get(i));
    }
    
  }
  
  public static void ex03() {
    
    List<String> flower = new ArrayList<String>();
    
    flower.add("김민지");
    flower.add("팜하니");
    flower.add("다니엘");   
    flower.add("강해린");
    flower.add("이혜인");
    
    flower.set(0, "사쿠라");
    
    flower.remove(1);
    
    for(int i = 0, length = flower.size(); i < length; i++) {
      System.out.println(flower.get(i));
    }
  }
  
  public static void ex04() {
    
    Integer[] a = {2004, 2004, 2005, 2006, 2008};
    List<Integer> years = Arrays.asList(a);

    for(int i = 0, length = years.size(); i < length; i++) {
      System.out.println(years.get(i));
    }
  }
  
  public static void ex05() {
    
    List<Integer> years = Arrays.asList(2004, 2004, 2005, 2006, 2008);
    
    for(int i = 0, length = years.size(); i < length; i++) {
      System.out.println(years.get(i));
    }
  }
  
  public static void main(String[] args) {

    ex04();

  }

}
