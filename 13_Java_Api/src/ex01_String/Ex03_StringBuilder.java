package ex01_String;

public class Ex03_StringBuilder {

  public static void main(String[] args) {
    // 1.5~ synchronized 처리 X, 빠름, 메모리 적게 낭비
    StringBuilder sb;
    
    sb = new StringBuilder();
    
    sb.append("김");
    sb.append("민");
    sb.append("지");
    
    String name = sb.toString();
    System.out.println(name);
  }

}
