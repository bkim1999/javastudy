package ex03_Rectangle;

public class MainWrapper {

  public static void main(String[] args) {
    
    Square s1 = new Square();
    s1.setWidth(5);
    s1.setHeight(5);
    s1.info();

    Square s2 = new Square(6);
    s2.info();
    
  }

}
