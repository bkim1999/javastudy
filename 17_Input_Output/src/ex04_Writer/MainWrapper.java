package ex04_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class MainWrapper {
  
  /*
   * java.io.Writer
   * 문자 기반 출력
   * int, char[], String
   */
  
  public static void ex01() {
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex01.txt");
    FileWriter fw = null;
    
    try {
      
      fw = new FileWriter(file, true);
      int c = 'M';
      char[] cbuf = {'i', 'n', 'j', 'i'};
      String str = " 그녀는 신인가?";
      
      fw.write(c);
      fw.write(cbuf);
      fw.write(str);
      
      System.out.println(file.getPath() + " 파일 생성 완료!!!!!!!");
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fw != null) {
          fw.close();
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex02() {
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex02.txt");
    BufferedWriter fw = null;
    
    try {
      
      fw = new BufferedWriter(new FileWriter(file));
      int c = 'H';
      char[] cbuf = {'a', 'n', 'n', 'i'};
      String str = "그녀는 신인가?";
       
      fw.write(c);
      fw.write(cbuf);
      fw.newLine();
      fw.write(str);
      
      System.out.println(file.getPath() + " 파일 생성 완료!!!!!!!");
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fw != null) {
          fw.close();
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex03() {
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex03.txt");
    PrintWriter pw = null;
    
    try {
      
      pw = new PrintWriter(file);
      String c = "다니엘, ";
      String str = "그녀는 신인가?";
      
      pw.println(c);
      pw.print(str);
      
      System.out.println(file.getPath() + " 파일 생성 완료!!!!!!!");
    } catch(IOException e) {
        e.printStackTrace();
    } finally {
        pw.close();
    }
  }
 
  
  public static void main(String[] args) {
    ex01();
  }
}
