package ex03_throw;

import java.util.Scanner;

public class MainWrapper {
  public static void main(String[] args) {             
   
    Scanner sc = null;
    try {
         sc = new Scanner(System.in);
         System.out.println("몇 살?");
         int age = sc.nextInt();
         if(age < 0 || age > 100) {
           throw new RuntimeException();
         }
         System.out.println(age >= 20 ? "주류 판매 가능" : "주류 판매 불가");
    } catch(Exception e) {
      System.out.println("똑바로 입력해");
    } finally {
      sc.close();
    }
  }

}
