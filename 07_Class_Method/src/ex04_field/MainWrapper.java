package ex04_field;

public class MainWrapper {

  public static void main(String[] args) {
    AccCalculator myAcc = new AccCalculator();
    
    myAcc.showValue();
    
    myAcc.addition(100);
    
    myAcc.multiplication(4);
    
    myAcc.subtraction(1);
    
    myAcc.division(3);
    
    myAcc.showValue();
  }

}
