package ex07_Class;

public class MainWrapper {

  public static void ex01() {

    Object obj = new Person();
    
    ((Person) obj).setName("이혜인");
    ((Person) obj).setAge(16);
    System.out.println( ((Person) obj).getName() + " " + ((Person) obj).getAge());
    
  }
  
  public static void ex02() {
    
    Person p1 = new Person("김민지", 20);
    Person p2 = new Person("김민지", 20);
    
    boolean same = p1.equals(p2);
    
    System.out.println(same);
    
  }
  
  public static void ex03() {
    
    Person p = new Person("팜하니", 20);
    
    System.out.println(p);
    System.out.println(p.toString());
    
  }
  public static void main(String[] args) {
    
    ex03();    
    
  }

}