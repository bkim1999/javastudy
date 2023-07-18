package ex03_advanced_for;

import java.util.Arrays;

public class MainWrapper {

  public static void ex01() {
    int[] a = {10, 20, 30};
    
    for(int e : a) {
      System.out.println(e);
    }
  }
  
  public static void ex02() {
    int[] a = {10, 20, 30};
    
    for(int e : a) {
      e++;
    }
    
    System.out.println(Arrays.toString(a));
    
    for(int i = 0; i < a.length; i++) {
      a[i]++;
    }
    
    System.out.println(Arrays.toString(a));

  }
  
  public static void ex03() {
    int[][] a = {
      {10, 20},
      {30, 40},
      {50, 60}
    };
    
    for(int[] e : a) {
      for(int n : e) {
        System.out.print(String.format("%4d", n));
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    
    ex03();

  }

}
