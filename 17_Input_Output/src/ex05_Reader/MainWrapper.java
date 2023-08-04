package ex05_Reader;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainWrapper {
  
  public static void ex01() {
  
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex01.txt");
    
    FileReader fr = null;
    
    try {
      fr = new FileReader(file);
      StringBuffer sb = new StringBuffer();
      int ch = 0;
      while((ch = fr.read()) != -1) {
        sb.append((char)ch);
      }
      
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fr != null) {
          fr.close();
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex02() {
    
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex02.txt");
    
    FileReader fr = null;
    
    try {
      fr = new FileReader(file);
      StringBuffer sb = new StringBuffer();
      int readChar = 0;
      char[] cbuf = new char[2];
      while((readChar = fr.read(cbuf)) != -1) {
        sb.append(cbuf, 0, readChar);
      }
      
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fr != null) {
          fr.close();
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex03() {
    
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex03.txt");
    
    BufferedReader br = null;
    
    try {
      br = new BufferedReader(new FileReader(file));
      String line = null;
      StringBuffer sb = new StringBuffer();
      while((line = br.readLine()) != null) {
        sb.append(line + "\n");
      }
      
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(br != null) {
          br.close();
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex04() {
    
    File dir = new File("C:/storage");
    
    File file = new File(dir, "server.dat");
    
    BufferedOutputStream bout = null;
    
    try {
        bout = new BufferedOutputStream(new FileOutputStream(file));
        String s1 = "김민지는";
        String s2 = "신이야";
        bout.write(s1.getBytes("UTF-8"));
        bout.write(s2.getBytes("UTF-8"));
        bout.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
    
    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      String line = null;
      StringBuffer sb = new StringBuffer();
      while((line = br.readLine()) != null) {
        sb.append(line);
      }
      System.out.println(sb.toString());
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
    
  }
  
  

  public static void main(String[] args) {
    ex04();
  }

}
