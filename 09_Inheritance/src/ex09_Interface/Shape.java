package ex09_Interface;

/*
 * Interface
 * 1. JDK 1.7 이전 : 추상 메소드 + final 상수로만 구성됨 추상 클래스
 * 2. JDK 1.8 이후 : 추상 메소드 + default 메소드 + static 메소드 + final 상수
 *    1) 추상 메소드 : 본문 X (대부분 추상 메소드로 구성)
 *    2) default 메소드 : 본문이 있는 메소드
 *    3) static 메소드 : 클래스 메소드 (본문 있음)
 * 3. 인터페이스의 추상 메소드는 abstract 생략 가능
 * 
 *      Inheritance      vs      Interface
 * 
 *      상속받는다                구현한다
 *        extends                implements 
 */

public interface Shape{
  
  // final 상수
  public static final double PI = 3.14;
  
  // 추상 메소드
  double getArea();
  
  public default void info1() {
    System.out.println("얍");
  }
  
  public static void info2() {
    System.out.println("얍");
  }
  
}
