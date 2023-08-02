package ex01_try_catch;

import java.net.URL;
import java.util.Scanner;

public class MainWrapper {

  public static void ex01() {
    try {
      
      String name = "김민지";
      Integer.parseInt(name); // 발생한 예외를 던짐
      
    } catch(RuntimeException e) {
      System.out.println("예외발생");
    }
  }
  
  public static void ex02() {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("덧셈식을 입력해.");
      String expr = sc.next();
      String[] numbers = expr.split("[+]");
      int ans = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
      System.out.println(ans);
    } catch (NumberFormatException e) {
      System.out.println("숫자가 아니잖아");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("덧셈식에 + 포함해라");
    } catch (Exception e){
      System.out.println("망했다...");
    }
  }
  
  public static void ex03() {
    
    try {
      URL url = new URL("http://www.naver.com");
    } catch(Exception e) {
      System.out.println("예외!!!!");
    }
  }
  
  public static void main(String[] args) {
    ex02();
    String star = "너의 집 앞에서 한참동안 기다린 거야"
        + "니가 오는 길에 혹시나 마주칠까봐"
        + "널 만나게 되면 어떤 얘길 먼저 꺼낼까"
        + "우연히 널 만난 것처럼 보여야할텐데"
        + "첫눈에 반해 널 사랑했어"
        + "어떻게 표현 할지도 몰라"
        + "눈치도 없이 나의 심장만 두근거려"
        + "";
        
  }

}
