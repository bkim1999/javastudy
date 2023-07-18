package ex02_two_dim;

import java.util.Arrays;

public class MainWrapper {
  
  public static void ex01() {
    int[][] a;
    
    a = new int[3][2]; // 3행 2열
    
    System.out.println(a[0][0] + " " + a[0][1]);
    System.out.println(a[1][0] + " " + a[1][1]);
    System.out.println(a[2][0] + " " + a[2][1]);
  }
  
  public static void ex02() {
    int[][] a = new int[3][2]; // 3행 2열
    
    System.out.print(String.format("%4d", a[0][0]));
    System.out.println(String.format("%4d", a[0][1]));
    System.out.print(String.format("%4d", a[1][0]));
    System.out.println(String.format("%4d", a[1][1]));
    System.out.print(String.format("%4d", a[2][0]));
    System.out.println(String.format("%4d", a[2][1]));
  }
  
  public static void ex03() {
    int[][] a = new int[3][2]; // 3행 2열
    
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[0].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  
  public static void ex04() {
    int[][] a = {
        {10, 20},
        {30, 40},
        {50, 60}
    }; // 3행 2열
    
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[0].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  
  
  public static void ex05() {
    int[][] a = {
        {10, 20},
        {30, 40},
        {50, 60}
    }; // 3행 2열
    
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  
  public static void ex06() {
    int[][] a = {
        {10},
        {20, 30},
        {40, 50, 60}
    };
    
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  
  

  public static void main(String[] args) {
    ex06();
  }

}