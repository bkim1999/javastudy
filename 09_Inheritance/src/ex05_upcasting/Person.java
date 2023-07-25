package ex05_upcasting;

public class Person {
  
  private String name;
  
  public Person() {
    
  }
  
  public Person(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println("냠");
  }
  
  public void sleep() {
    System.out.println("쿨");
  }
  
  public void study() {
  }
  
  public void working() {
  }
  
  public void info() {
    System.out.println("이름: " + getName());
  }
}
