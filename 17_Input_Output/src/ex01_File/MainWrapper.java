package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class MainWrapper {
  /*
   * java.io.File
   * 파일, 디렉터리를 관리 (생성, 삭제, 정보)
   * 
   * 경로 작성
   * 윈도우 \ 리눅스 /
   * SEPERATOR 필드값이 자동으로 구분자 바꿔줌
   */
  
  public static void ex01() {
    File dir;
    
    dir = new File("C:" + File.separator + "storage");
    
    if(dir.exists()) {
      // dir.deleteOnExit();
      dir.delete();
      System.out.println("C:\\ storage deleted completly.");
    } else {
      dir.mkdirs();
      System.out.println("C:\\storage 디렉토리 만들기");
    }
  }
  
  public static void ex02(){
    try {
      File dir;
      dir = new File("C:" + File.separator + "storage");
      if(!dir.exists()) {
        dir.mkdirs();
        System.out.println("C:\\storage 디렉토리 만들기");
      }
      
      File file = new File(dir, "뉴진스.txt");
      if(file.exists()) {
        file.delete();
        System.out.println("C:\\storage\\뉴진스.txt deleted completly.");
      } else {
        file.createNewFile(); 
        System.out.println("C:\\storage\\뉴진스.txt 디렉토리 만들기");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void ex03() {
    File dir = new File("C:/Program Files/Java/jdk-11");
    File[] files = dir.listFiles();
    
    for(int i = 0; i < files.length; i++) {
      File file = files[i];
      StringBuilder sb = new StringBuilder();
      sb.append(String.format("%-15s", file.getName()));
      
      long lastModified = file.lastModified();
      String strLastModified = new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(lastModified);
      sb.append(String.format("%-25s", strLastModified));
      
      String kind = file.isDirectory() ? "파일 폴더" : "파일";
      sb.append(String.format("%-10s", kind));
      
      long size = file.isFile() ? file.length() : 0;
      long kbSize = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
      sb.append(String.format("%-10s", kbSize + "KB"));
      
      System.out.println(sb.toString());
    }
  }
  
  public static void main(String[] args) {
    ex03();
  }
}
