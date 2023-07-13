package ex02_loop;

public class MainWrapper {
  /*
   * for문
   * 1. 실행 순서 : 초기값 -> 조건문 -> 실행문 -> 증감문 -> 조건문 -> ...
   */
  public static void ex01() {
    for(int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }
  
  public static void ex02() {
    int count = 5;
    for(int i = 1; i <= count; i++) {
      System.out.println(i + "번");
    }
  }
  
  public static void ex03() {
    int i = 0;
    while(i < 10) {
      System.out.println(i++);
    }
  }
  
  public static void ex04() {
    int i = 100;
    do {
      System.out.println(i++);
    } while(i<10);
  }
  
  public static void ex05() {
    int i = 1;
    while(true) {
      if(i > 10)
        break;
      System.out.println(i++);
    }
    for(;;) {
      if(i < 1)
        break;
    }
  }
  
  public static void ex06() {
    for(int i = 1; i <= 50; i++) {
      if (i % 7 == 0)
        continue;
      System.out.println(i);
    }
  }
  
  public static void ex07() {
    for(int i = 1; i <= 5; i++) {
      System.out.println("======== " + i + "일차입니다.============");
      for(int j = 1; j <= 8; j++) {
        System.out.println(i + "일차 " + j + "교시입니다.");
      }
    }
  }
  
  public static void main(String[] args) {
    ex07();
  }
}