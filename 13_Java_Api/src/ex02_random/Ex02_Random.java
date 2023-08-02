package ex02_random;

import java.util.Random;

public class Ex02_Random {

  public static void ex01() {
    
  }
  
  public static void main(String[] args) {
    Random random = new Random(11111);
    double randomNum1 = random.nextDouble();
    int randomNum2 = random.nextInt();
    int randomNum3 = random.nextInt(5);
    
    System.out.println(randomNum1);
    System.out.println(randomNum2);
    System.out.println(randomNum3);
     
  }

}
