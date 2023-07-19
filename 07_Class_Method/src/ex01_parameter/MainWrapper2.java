package ex01_parameter;

public class MainWrapper2 {

  public static void main(String[] args) {
    print(5);
    print((20+20+19+18+16) / 5.0);
    print(2004, 2004);
    print(18.0, 18.0);
  }
  
  public static void print(int a) {
    System.out.println(a);
  }
  public static void print(double a) {
    System.out.println(a);
  }
  public static void print(int a, int b) {
    System.out.println(a + "    " + b);
  }
  public static void print(double a, double b) {
    print(a);
    print(b);
  }
}