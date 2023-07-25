package ex03_constructor;

public class Student extends Person{

  private String school;
  
  public Student() {
    System.out.println("Student() 호출");
  }
  
  public Student(String school) {
    this.school = school;
    System.out.println("Student(String school) 호출");
  }
  
  public Student(String name, String school) {
    super(name);
    this.school = school;    
  }
  
  public String getSchool() {
    return school;
  }
  
  public void setSchool(String school) {
    this.school = school;
  }
  
}
