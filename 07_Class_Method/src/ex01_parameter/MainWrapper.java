package ex01_parameter;

import java.util.Arrays;

public class MainWrapper {
  
  public static void main(String[] args) {
    ex01();
    ex02(5);
    ex03(1.5, 1.2);
    ex04("김민지", 20);
    int[] a = {20, 20, 19, 18, 16};
    ex05(a);
  }
  
  public static void ex01() {
    System.out.println("oh say it ditto 아침은 너무 멀어 so say it ditto");
  }
  
  public static void ex02(int nj) {
    System.out.println("몇 명인가? : " + nj);
  }
  
  public static void ex03(double nj, double nt) {
    System.out.println(nj + "  " + nt);
  }
  
  public static void ex04(String name, int age) {
    System.out.println("이름: " + name + "    나이: " + age);
  }
  
  public static void ex05(int[] a) {
    System.out.println(Arrays.toString(a));
  }
}