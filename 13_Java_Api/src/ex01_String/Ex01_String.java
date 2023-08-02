package ex01_String;

public class Ex01_String {
  
  /*
   * 동일한 리터럴 -> 재사용
   */
  
  public static void ex01() {
    
    String kim1 = "김민지";
    String kim2 = "김민지";
    
    boolean isEqual = kim1 == kim2;
    System.out.println(isEqual);
    
  }
  
  public static void ex02() {
    
    String name1 = new String("팜하니");
    String name2 = new String("팜하니");
    
    boolean isEqual = name1 == name2;
    System.out.println(isEqual);
  }
  
  public static void ex03() {
    
    String name1 = new String("t팜하니");
    String name2 = new String("t팜하니");
    String name3 = new String("T팜하니");
    String eta = "내 생일 파티에 너만 못 온 그 날"
        + "혜진이가 엄청 혼났던 그 날"
        + "지원이가 여친이랑 헤어진 그 날"
        + "걔만 멋있는 옷을 입고 그 날"
        + "걔는 언제나 너가 없이 그 날"
        + "Heard him say"
        + "We can go wherever you want"
        + "he said words and I'm down"
        + "we can go whenever you like"
        + "where are you";
    
    boolean isEqual1 = name1.equals(name2);
    boolean isEqual2 = name1.equals(name3);
    boolean isEqual3 = name1.equalsIgnoreCase(name3);
    System.out.println(isEqual1);
    System.out.println(isEqual2);
    System.out.println(isEqual3);
        
  }
  
  public static void ex04() {
    
    String name1 = "KimMinji";
    
    System.out.println(name1.toUpperCase());
    System.out.println(name1.toLowerCase());

  }
  
  public static void ex05() {
    
    String name1 = "Kim Minji\n";
    int length = name1.length();
    System.out.println(length);
    
  }
  
  public static void ex06() {
    
    String name1 = "Kim Minji\n";
    char chr = name1.charAt(7);
    System.out.println(chr);
    
  }
  
  public static void ex07() {
    
    String name1 = "Kim Minji";
    String last = name1.substring(0, 3);
    String first = name1.substring(4);
    System.out.println(first + " " + last);
    
  }
  
  public static void ex08() {
    
    String name1 = "Kim Minji";
    int index = name1.indexOf("Min");
    int index2 = name1.indexOf("i", 4);
    System.out.println(index);
    System.out.println(index2);
    
  }
  
  public static void ex09() {
    
    String name1 = "Kim Minji";
    int index = name1.lastIndexOf("Min");
    int index2 = name1.lastIndexOf("i", 4);
    System.out.println(index);
    System.out.println(index2);
    
  }
  
  public static void ex10() {
    
    String name1 = "Kim Minji";
    boolean isIn = name1.contains("Min");
    System.out.println(isIn);
    
  }
  
  public static void ex11() {
    
    String name1 = "    ";
    boolean isEmpty = name1.isEmpty();
    boolean isBlank= name1.isBlank();
    System.out.println(isEmpty);
    
  }
  
  public static void ex12() {
    
    int number = 100;
    System.out.println(String.format("%o", number));
    System.out.println(String.format("%d", number));
    System.out.println(String.format("%x", number));
    System.out.println(String.format("%X", number));
    
    String name = "다니엘";
    System.out.println(String.format("%5d", number));
    System.out.println(String.format("%-5d", number));
    System.out.println(String.format("%05d", number));
    System.out.println(String.format("%10s", name));
    System.out.println(String.format("%- 10s", name));
    
  }
  
  public static void ex13() {
    // startsWith endsWith matches replaceAll split
    String name = "\n 강해린 \n";
    System.out.println(name.strip());
    System.out.println(name.trim());
  }
  
  public static void ex14() {
    // startsWith endsWith matches replaceAll split
    String name = "이혜인";
    System.out.println(name.replace("이", "김"));
  } 
  
  public static void main(String[] args) {
    
    ex14();
    
  }
}
