package ex05_upcasting;

public class Student extends Person{
  
  private String school;
  
  public Student() {
    super(); // 생 략 가 능
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

  @Override
  public void study() { 
    System.out.println("공부중...");
  }
  
  @Override
  public void info() {
    super.info();
    System.out.println("학교: " + getSchool());
  }
}