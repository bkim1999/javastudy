package ex02_random;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

  public static void main(String[] args) {
    SecureRandom sr = new SecureRandom();
    
    //보안처리된 난수 발생, Random과 같은 사용법
    
    double randomNum1 = sr.nextDouble();
    int randomNum2 = sr.nextInt();
    int randomNum3 = sr.nextInt(5);

    System.out.println(randomNum1);
    System.out.println(randomNum2);
    System.out.println(randomNum3);
  }

}
