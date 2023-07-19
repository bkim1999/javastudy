package ex02_return;

public class MainWrapper2 {

  public static void main(String[] args) {
    positivePrint(20);
    positivePrint(-20);
  }
  
  public static void positivePrint(int a) {
    if(a < 0) {
      return;
    }
    System.out.println(a);
  } 
}