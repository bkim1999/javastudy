package ex03_operator;

public class dd {
    public static void main(String[] args) {
      int i = 1;

      System.out.println(System.identityHashCode(i));
      d(i);
      System.out.println(i);
      
      i = i+1;
      System.out.println(System.identityHashCode(i));
      
      String s = "whwh";
      e(s);
      System.out.println(s);
    }
    
    public static void d(int i) {
      System.out.println(System.identityHashCode(i));
      i++;

      System.out.println(System.identityHashCode(i));
    }
    
    public static void e(String d) {
      d += "HHHHHHHH";
    }
}