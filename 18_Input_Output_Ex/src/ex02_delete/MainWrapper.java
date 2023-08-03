package ex02_delete;

import java.io.File;

public class MainWrapper {

  public static void ex01() {
    File dir = new File("C:/2023/08/03/15");
    while(!dir.equals(new File("C:/"))) {
      dir.delete();
      dir = dir.getParentFile();
      System.out.println(dir + " 삭제!");
    }
  }
  
  public static void ex02() {
    File dir = new File("C:/storage");
    File[] files = dir.listFiles();
    if(files != null) {
      for(File file : files) {
        file.delete();
        System.out.println(file + " 삭제!");
      }
    }
    dir.delete();
    System.out.println(dir + " 삭제!");
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
