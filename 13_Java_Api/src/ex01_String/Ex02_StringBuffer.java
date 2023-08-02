package ex01_String;

public class Ex02_StringBuffer {

  public static void main(String[] args) {
    /*
     * JDK 1.0~, synchronized 처리, 느려, 메모리 적게 낭비
     */
    
    StringBuffer sb;
    
    sb = new StringBuffer();
    
    sb.append("김");
    sb.append("민");
    sb.append("지");
    
    String name = sb.toString();
    System.out.println(name);
  }

}
