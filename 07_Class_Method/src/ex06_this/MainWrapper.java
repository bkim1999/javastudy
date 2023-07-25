package ex06_this;

public class MainWrapper {

  public static void main(String[] args) {

    ChainCalculator myCalc = new ChainCalculator();
    
    myCalc.printThis();
    
    myCalc.on().addition(3).subtraction(1).multiplication(10).division(2).done();
  }

}