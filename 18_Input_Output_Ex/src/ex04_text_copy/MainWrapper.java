package ex04_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainWrapper {

  public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "alphabet.txt");
    
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));){
      
      for(int i = 0; i < 26; i++) {
        bw.write((char)('A' + i));
      }
      
      System.out.println(file + " 저장 완료!");
      
    } catch(IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    
    File dir = new File("C:/storage");
    File src = new File(dir, "alphabet.txt");
    File copy = new File(dir, "alphabet2.txt");
    
    try (BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(copy))){
      
      String line = null;

      while((line = br.readLine()) != null) {
        bw.write(line);
      }

      System.out.println(src + " → " + copy);
      
    } catch(IOException e) {
      e.printStackTrace();
    } 
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }

}
