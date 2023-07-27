package ex03_Bus;

public class MainWrapper {

  public static void main(String[] args) {
    
    Bus bus = new Bus();
    
    bus.getOn(1, new Person("팜하니"));
    bus.getOn(2, new Person("강해린"));
    bus.getOn(25, new Student("김민지"));
    bus.getOn(30, new Student("다니엘"));
    bus.getOn(25, new Student("이혜인"));
    
    bus.getOff(1);
    bus.getOff(10);
    bus.getOff(30);
    
    bus.info();
    
  }

}
