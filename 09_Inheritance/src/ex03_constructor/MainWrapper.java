package ex03_constructor;

public class MainWrapper {

  public static void main(String[] args) {
    
    Student s = new Student(); // 부모클래스 Person() 디폴트 생성자 먼저 자동 생성
    System.out.println(s.getName());
    System.out.println(s.getSchool());
    
    Student s2 = new Student("뉴진스대학교");
    System.out.println(s2.getName());
    System.out.println(s2.getSchool());
   
    Student s3 = new Student("하니", "뉴진스대학");
    System.out.println(s3.getName());
    System.out.println(s3.getSchool());
    
  }
}