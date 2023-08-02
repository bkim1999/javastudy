package ex03_Date_Time;

public class Ex01_System {
  
  public static void ex01() {
    
    long timestamp = System.currentTimeMillis();
    System.out.println(timestamp);
  }
  
  public static void ex02() {
    String s1 = "";
    StringBuffer sf = new StringBuffer();
    StringBuilder sb = new StringBuilder();
    long start = System.nanoTime();
    for(char ch = 'A'; ch <= 'Z'; ch++) {
      // s1 += ch;
      sf.append(ch);
    }
    long end = System.nanoTime();
    System.out.println(end - start);
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
