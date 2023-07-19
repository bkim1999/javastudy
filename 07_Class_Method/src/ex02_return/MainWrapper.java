package ex02_return;

import java.util.Arrays;

public class MainWrapper {

  public static void main(String[] args) {
    System.out.println(getName());
    System.out.println(getAge());
    System.out.println(isAlive());
    System.out.println(Arrays.toString(getHobbies()));
    
  }
  
  public static String getName() {
    String name = "김민지";
    return name;
  }
  
  public static int getAge() {
    int age = 20;
    return age;
  }
  
  public static boolean isAlive() {
    boolean isAlive = getAge() <= 100;
      return isAlive;
  }
  
  public static String[] getHobbies() {
    String[] hobbies = {"호흡", "식사", "수면"};
    return hobbies;
  } 
}
