package ex04_override;

public class CaffeLatte extends Espresso{
  
  @Override
  public void taste() {
    System.out.println("달");
  }
    
}