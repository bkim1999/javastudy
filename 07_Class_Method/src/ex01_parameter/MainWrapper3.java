package ex01_parameter;

public class MainWrapper3 {

  public static void main(String[] args) {
    ex01(2004);
    ex01(2004, 2004);
    ex01(2004, 2004, 2005);
    ex01(2004, 2004, 2005, 2006);
    ex01(2004, 2004, 2005, 2006, 2008);
    ex02("김민지", "팜하니", "다니엘", "강해린", "이혜인");
  }
  
  public static void ex01(int... a) {
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
  
  public static void ex02(String... name) {
    for(int i = 0; i < name.length; i++) {
      System.out.println(name[i]);
    }
  }
} 
