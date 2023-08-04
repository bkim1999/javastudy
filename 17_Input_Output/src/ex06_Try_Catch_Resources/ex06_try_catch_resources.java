package ex06_Try_Catch_Resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ex06_try_catch_resources {
  
  
  public static void main(String[] args) {
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex01.txt");
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
      String str1 = "강해린 그녀는 신인가?";
      String str2 = "신 그는 강해린인가?";
      
      bw.newLine();
      bw.write(str1);
      bw.newLine();
      bw.write(str2);
      
      System.out.println(file.getPath() + " 파일 데이터 추가 완료!!!!!!!!!");
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
} 