package ex02_finally;

import java.util.Scanner;

public class Mainwrapper {
  /* try/catch문의 마지막 블록
   * 예외 발생 여부와 상관 없이 무조건 마지막에 실행딤.
   */
  public static void main(String[] args) {             
   
    Scanner sc = null;
    try {
         sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age >= 20 ? "주류 판매 가능" : "주류 판매 불가");
    } catch(Exception e) {
      System.out.println("똑바로 입력해");
    } finally {
      sc.close();
    }
  }

}
