package ex07_Class;

public class MainWrapper {

  public static void main(String[] args) {

    Object obj = new Person();
    
    ((Person) obj).setName("이혜인");
    ((Person) obj).setAge(16);
    System.out.println( ((Person) obj).getName() + " " + ((Person) obj).getAge());

  }

}
