package ex05_throws;

public class MainWrapper {

  public static void main(String[] args) {
    
    try {
      print("김민지");
      print(null);
    } catch(NullPointerException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public static void print(String str) throws NullPointerException {
    
    System.out.println("첫글자: " + str.substring(0,1));
    System.out.println("나머지: " + str.substring(1));
  }

}
