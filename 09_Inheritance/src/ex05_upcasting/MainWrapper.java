package ex05_upcasting;

/*
 * upcasting
 * 서브클래스 -> 슈퍼클래스
 * 자동으로 변환
 * 
 * 장점
 * 슈퍼클래스 타입으로 서브클래스 객체 저장 가능
 * 서로 다른 타입의 객체를 하나의 타입으로 관리할 수 있다
 * 
 * 단점
 * 슈퍼클래스 타입으로 저장 -> 슈퍼 클래스의 메소드만 호출 가능
 * 해결법: 오버라이드
 */

public class MainWrapper {
  
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.setName("김민지");
    s1.setSchool("뉴진고");
    s1.eat();
    s1.sleep();
    s1.study();
    System.out.println(s1.getName());
    System.out.println(s1.getSchool());
    s1.info();
    
    Student s2 = new Student("팜하니", "뉴진고");
    s2.eat();
    s2.sleep();
    s2.study();
    System.out.println(s2.getName());
    System.out.println(s2.getSchool());
    s2.info();

    Alba a = new Alba("다니엘", "뉴진스", "어도어");
    a.eat();
    a.sleep();
    a.study();
    a.working();
    System.out.println(a.getName());
    System.out.println(a.getSchool());
    System.out.println(a.getWork());
    a.info();
    
    Person p1 = new Student("강해린", "뉴진스고");
    Person p2 = new Alba("이혜인", "뉴진스고", "어도어");
    
    p1.study();
    p2.working();
  }
  
}
