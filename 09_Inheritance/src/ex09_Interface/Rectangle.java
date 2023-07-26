package ex09_Interface;

public class Rectangle implements Shape{
  
  private int width, height;
  
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
  @Override
  public double getArea() {
    return width * height;
  }

}