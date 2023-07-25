package ex06_this;

/**
 * 
 * <p>메소드를 연속해서 호출할 수 있는 메소드 체이닝이 가능한 계산기</p>
 * 사칙연산 메소드를 연속해서 연출할 수 있다.
 * @author 김범철
 * @since 2023.07.20
 *
 */
public class ChainCalculator {
  /**
   * 필드 value는 사칙연산의 결과를 저장한다.
   * 
   */
  private double value;
  
  public void printThis(){
    System.out.println("현재 객체의 참조값: " + this);
  }
  
  public ChainCalculator on() {
    System.out.print(getValue());
    return this; 
  }
  
  public void done() {
    System.out.println(" = " + getValue());
  }
  
  public void setValue(double value) {
    this.value = value;
  }
  
  public double getValue() {
    return value;
  }
  
  public ChainCalculator addition(double a) {
    value += a;
    System.out.print(" + " + a);
    return this;
  }
  
  public ChainCalculator subtraction(double a) {
    value -= a;
    System.out.print(" - " + a);
    return this;
  }
  
  public ChainCalculator multiplication(double a) {
    value *= a;
    System.out.print(" * " + a);
    return this;
  }
  
  public ChainCalculator division(double a) {
    value /= a;
    System.out.print(" / " + a);
    return this;
  }
}