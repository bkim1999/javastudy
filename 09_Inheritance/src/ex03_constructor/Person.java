package ex03_constructor;

public class Person {
  
  private String name;
  
  public Person() {
    System.out.println("Person() 호출");
  }
  
  public Person(String name) {
    this.name = name;
    System.out.println("Person(String name) 호출");
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
}
