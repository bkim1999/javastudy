package ex04_Chair;

public class Student extends Person{

  private String school;
  
  public Student() {}
  
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
  public void info() {
    super.info();
    System.out.println("학교: " + school);
  }
}
