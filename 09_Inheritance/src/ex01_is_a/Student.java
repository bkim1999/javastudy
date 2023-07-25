package ex01_is_a;

/*
 * 상속
 * 1. 다른 클래스 기능(메소드)을 물려 받아 사용하는 기능이다.
 * 2. 가능한 관계:
 *    1) is a 관계 : ~ is a ~
 *    2) has a 관계 : ~ has a ~
 * 3. superclass -> subclass
 */

public class Student extends Person {

  public void study() {
    System.out.println("공부중...");
  }  
  
  
  
}
