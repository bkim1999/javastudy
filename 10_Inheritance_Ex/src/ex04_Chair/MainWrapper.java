package ex04_Chair;

public class MainWrapper {

  public static void main(String[] args) {
    
    Chair c = new Chair();
    c.setPerson(new Student("김민지", "뉴진스고등학교"));
    c.getPerson().info();
    
    Chair c2 = new Chair();
    c2.setPerson(new Alba("팜하니", "뉴진고", "어도어"));
    c2.getPerson().info(); 
     
  }

}