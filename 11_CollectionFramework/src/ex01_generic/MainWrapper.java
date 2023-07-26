package ex01_generic;

public class MainWrapper {

  public static void main(String[] args) {
    
    Box<String> box1 = new Box<String>();
    box1.setItem("What's your ETA! what's your ETA!");
    System.out.println(box1.getItem());
    
    Box<Integer> box2 = new Box<Integer>();
    box2.setItem(2022);
    System.out.println(box2.getItem());
    
    Box<Person> box3 = new Box<Person>();
    box3.setItem(new Person("킴민지"));
    System.out.println(box3.getItem());
  }
  
}