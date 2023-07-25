package ex06_downcasting;

public class MainWrapper {

  public static void ex01() {
    Person p = new Student();
    p.eat();
    p.sleep();
    ((Student) p).study();
    ((Worker) p).work(); // 잘못된 캐스팅
  }
  
  public static void ex02() {
    Person p1 = new Student();
    Person p2 = new Worker();
    System.out.println(p1 instanceof Person);
    System.out.println(p1 instanceof Student);
    System.out.println(p1 instanceof Worker);
    System.out.println(p2 instanceof Student);
    
    if(p1 instanceof Student) {
      ((Student) p1).study();
    }
    
    if(p2 instanceof Worker) {
      ((Worker) p2).work();
    }
  }
  
  public static void main(String[] args) {
    ex02();
  }

} 
