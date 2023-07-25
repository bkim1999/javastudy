package ex01_Car;

public class MainWrapper {

  public static void main(String[] args) {
    
    Ev ev = new Ev();
    EngineCar ec = new EngineCar();
    HybridCar hc = new HybridCar();
    
    ev.drive();
    ev.charge();
    
    ec.drive();
    ec.addFuel();
    
    hc.drive();
    hc.charge();
    hc.addFuel();
  
  }

}
