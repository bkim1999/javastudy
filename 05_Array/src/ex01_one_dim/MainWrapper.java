package ex01_one_dim;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainWrapper {
  
  public static void ex01() {
    int[] a;
    a = new int[5];
    
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
  }
  
  public static void ex02() {
    
    int length = 5;
    int[] a = new int[length];
    
    for(int i = 0; i < length; i++) {
      System.out.println(a[i]);
    }
  }
  
  public static void ex03() {
    int[] a = new int[5];
    
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    
  }
  
  public static void ex04() {
    int[] a = {1, 2, 3, 4, 5};
    
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
  
  public static void ex05() {
    int day = 14;
    int nDay = 10;
    day += nDay;
    int wdIdx = 3;
    String[] weekname = {"월", "화", "수", "목", "금", "토", "일"};
    
    System.out.println(day + "일은 " + weekname[(nDay)%7 + wdIdx] + "요일이다.");
  }
  
  public static void ex06() {
    int[] a = new int[5];
    
    System.out.println(a);
  }

  
  public static void ex07() {
    int[] a = {10,20,30};
    int[] b;
    
    b = a;
    
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
    System.out.println(a);
    System.out.println(b);
    
  }
  
  public static void ex08() {
    int[] a = {10, 20, 30};
    
    int[] b = new int[5];
    
//    for(int i = 0; i < a.length; i++) {
//      b[i] = a[i];
//    }
    
    System.arraycopy(a, 0, b, 0, a.length);
    
    a = b;
    
    for(int i = 0; i < b.length; i++) {
      System.out.println("a[" + i + "] = " + a[i] + "   "
                       + "b[" + i + "] = " + b[i]);
    }
    
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    
  }
  
  public static void main(String[] args) {
    
    /* 배열
     * 배열명  인덱스   배열요소
     */
    
    ex08();  
  }

}
