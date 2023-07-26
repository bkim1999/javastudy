package ex09_Interface;

public class MainWrapper {

  public static void main(String[] args) {

    Shape s1 = new Rectangle(3, 5);
    Shape s2 = new Circle(3);
    
    System.out.println("직사각형 넓이: " + s1.getArea());
    System.out.println("원 넓이: " + s2.getArea());
    s1.info1();
    Shape.info2();
    
  }

}