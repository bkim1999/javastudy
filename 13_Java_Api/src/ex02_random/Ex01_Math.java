package ex02_random;


public class Ex01_Math {
  
  public static void ex01() {
    double randomNumber = Math.random();

    if(randomNumber < 0.1) {
      System.out.println("대박");
    }
    else {
      System.out.println("꽝");
    }
  }
  
  public static void ex02() {
    int randomNumber = (int) (Math.random() * 10) + 1; 
    System.out.println(randomNumber);
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
