package ex08_abstract;

/*추상 클래스
 * 1개 이상의 추상 메소드
 * abstract 키워드를 사용
 * 객체 생성 불가
 * 추상 클래스의 서브클래스는 무조건 추상 메소드를 오버라이드
 */


public abstract class Person {
  
  public void eat() {
    System.out.println("냠냠");
  }
  
  public void sleep() {
    System.out.println("ZZZZZZZZZ");
  }
  
  public abstract void study();
}
