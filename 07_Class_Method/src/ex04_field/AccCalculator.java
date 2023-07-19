package ex04_field;

/**
 * 
 * 사칙연산 결과를 저장할 수 있는 계산기 
 * 
 * @author 김범철
 * @since 2023.07.19
 * @version 1.0.0
 *
 */
public class AccCalculator {
  
  /**
   * 이 필드는 AccCalculator의 사칙연산 결과를<br>저장할 수 있는 필드이다.
   */
  private double value;
  
  /**
   * 
   * 파라미터 a를 필드 value에 더하는 메소드
   * 
   * @param a 실수
   */
  public void addition(double a) {
    System.out.print(value);
    value += a;
    System.out.println(" + " + a + " = " + value);
  }
  
  /**
   * 
   * 파라미터 a를 필드 value에서 빼주는 메소드
   * 
   * @param a 실수
   */
  public void subtraction(double a) {
    System.out.print(value);
    value -= a;
    System.out.println(" - " + a + " = " + value);
  }
  
  /**
   * 
   * 파라미터 a를 필드 value에 곱하는 메소드
   * 
   * @param a 실수
   */
  public void multiplication(double a) {
    System.out.print(value);
    value *= a;
    System.out.println(" * " + a + " = " + value);
  }
  
  /**
   * 
   * 파라미터 a로 필드 value를 나누는 메소드
   * 
   * @param a 실수
   */
  public void division(double a) {
    System.out.print(value);
    value /= a;
    System.out.println(" / " + a + " = " + value);
  }
  
  public void showValue() {
    System.out.println(value);
  }
  
}