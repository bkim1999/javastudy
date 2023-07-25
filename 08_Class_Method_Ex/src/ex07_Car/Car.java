package ex07_Car;

public class Car {
  
  private Driver driver;
  private int speed;
  private int fuel;
  private final int MAX_SPEED = 100;
  private final int MIN_SPEED = 0;
  
  public void setDriver(Driver driver) {
    this.driver = driver;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  public Driver getDriver() {
    return driver;
  }
  public int getSpeed() {
    return speed;
  }
  public int getFuel() {
    return fuel;
  }
  
  public void engineStart() {
    if(fuel == 0) {
      System.out.println("시동이 걸리지 않았습니다.");
    }
    else {
      System.out.println("시동이 걸렸습니다.");
    }
  }
  
  public void drive() {
    if(fuel == 0 || driver == null) {
      System.out.println("자동차가 움직이지 않습니다.");
    }
    else {
      System.out.println("자동차가 움직입니다.");
    }
  }
  
  public void accel(int speed) {
    if(speed < 0) {
      System.out.println("0 미만의 속도는 존재하지 않습니다.");
      return;
    }
    
    this.speed += speed;
    fuel--;
    
    if(this.speed > MAX_SPEED) {
      this.speed = MAX_SPEED;
    }
    
    System.out.println("기존 속도에 " + speed + "가 추가 (최고 속도는 "
                     + MAX_SPEED + "), 현재 속도는 " + this.speed);
  }
  
  public void brake(int speed) {
    if(speed < 0) {
      System.out.println("0 미만의 속도는 존재하지 않습니다.");
      return;
    }
    
    this.speed -= speed;
    
    if(this.speed < MIN_SPEED) {
      this.speed = MIN_SPEED;
    }
    
    System.out.println("기존 속도에서 " + speed + "만큼 줄어듬 (최저 속도는 "
                     + MIN_SPEED + "), 현재 속도는 " + this.speed);
  }
} 
