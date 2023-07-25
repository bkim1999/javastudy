package ex07_Car;

public class MainWrapper {
  public static void main(String[] args) {
    
    Driver driver = new Driver();
    driver.setName("다니엘");
    driver.setCareer(1);
    
    Car car = new Car();
    car.setDriver(driver);
    car.setFuel(50);
    car.engineStart();
    car.drive();    
    car.accel(105);
    car.brake(30);
  }
}