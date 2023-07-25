package ex03_Rectangle;

public class Rectangle {
  
  private int width;
  private int height;
  
  public Rectangle() {
  }
  
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
  
  public int getArea() {
    return width * height;
  }
  
  public void info() {
    System.out.println("너비: " + width);
    System.out.println("높이: " + height);
    System.out.println("넓이: " + getArea());
  }
  
}
