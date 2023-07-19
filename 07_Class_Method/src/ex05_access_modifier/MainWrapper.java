package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {
    
    User u = new User();

    u.setId("강해린");
    System.out.println(u.getId());
    
    u.setAge(18);
    System.out.println(u.getAge());
  }
  
}