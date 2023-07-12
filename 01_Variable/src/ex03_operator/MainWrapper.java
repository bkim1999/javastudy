package ex03_operator;

public class MainWrapper {
  
  // 메소드 정의
  public static void ex01() {

    int a = 5;
    int b = 2;
    
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    int mok = a / b;
    int mod = a % b;
    
    System.out.println(add);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(mok);
    System.out.println(mod);
    
    double x = 5;
    double y = 2;

    double addResult = x + y;
    double subResult = x - y;
    double mulResult = x * y;
    double mokResult = x / y;
    double modResult = x % y;
    
    System.out.println(addResult);
    System.out.println(subResult);
    System.out.println(mulResult);
    System.out.println(mokResult);
    System.out.println(modResult);
    
    int i = 5;
    int j = 2;
    
    double result = (double)i / (double)j;
    System.out.println(result);
     
  }
  
  public static void ex02() {
    
    int a = 10;
    System.out.println(++a);
    System.out.println(a);
    
    int b = 10;
    System.out.println(b++);
    System.out.println(b);
    
  }
  
  public static void ex03() {
    int a = 10;
    int b = 1;
    a += b;
  }
  
  public static void ex04() {
    int a = 3;
    int b = 5;
    
    boolean result1 = a > b;
    boolean result2 = a >= b;
    boolean result3 = a < b;
    boolean result4 = a <= b;
    boolean result5 = a == b;
    boolean result6 = a != b;
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    
    int x = 10;
    int y = 20;
    
    boolean andResult = x == 10 && y == 10;
    boolean orResult = x == 10 || y == 10;
    boolean notResult = !(x==10 || y == 10);
    
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
  }
  public static void main(String[] args) {
   
    // 메소드 호출
    ex04();

  }
  
  public static void supershy() {
    System.out.println("super shy super shy wait a minute while I make you mine make you mine");
  }
  
}