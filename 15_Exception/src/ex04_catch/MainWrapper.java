package ex04_catch;

public class MainWrapper {
  
  public static void ex01() {
    
    try {
      
      throw new RuntimeException("멈춰!");
      
    } catch (Exception e) {
      System.out.println(e.getClass().getName());
      System.out.println(e.getMessage());
    }
  }
  
  public static void ex02(String name) {
    
    try {
      System.out.println(name.substring(0, 1));
    } catch(Exception e) {
      e.printStackTrace();
    } 
    
  }

  public static void main(String[] args) {

    ex02(null);

  }

}
