package ex03_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ex02_OutputStream.Student;

public class MainWrapper {
  public static void ex01() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");
    
    // 파일입력스트림 선언
    FileInputStream fin = null;
    
    try {
      
      // 파일입력스트림 생성 (반드시 예외 처리 필요, 파일이 없으면 예외 발생)
      fin = new FileInputStream(file);
      
      // 입력된 데이터 저장 변수
      int c = 0;
      
      // read() 메소드
      // 1. 1개 데이터를 읽어서 반환한다.
      // 2. 읽은 내용이 없으면 -1을 반환한다.
      
      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();
      
      // 반복문 : 읽은 내용이 -1이 아니면 계속 읽는다.
      while( (c = fin.read()) != -1 ) {
        sb.append((char)c);
      }
      
      // 결과 확인
      System.out.println(sb.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fin != null) {
          fin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  public static void ex02() {
    
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "ex02.dat");
    FileInputStream fin = null;
    try {
      fin = new FileInputStream(file);
      
      byte[] b = new byte[4];
      
      int readByte = 0;
      
      StringBuilder sb = new StringBuilder();

      readByte = fin.read(b);
      sb.append(new String(b, 0, readByte));
      
      while((readByte = fin.read(b)) != -1) {
        sb.append(new String(b, 0, readByte));
      }
      
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fin != null) {
            fin.close();
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
    }
  }
  
  public static void ex03() { 
    
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "ex03.dat");
    BufferedInputStream bin = null;
    try {
      bin = new BufferedInputStream(new FileInputStream(file));
      
      byte[] b = new byte[4];
      
      int readByte = 0;
      
      StringBuilder sb = new StringBuilder();

      readByte = bin.read(b);
      sb.append(new String(b, 0, readByte));
      
      while((readByte = bin.read(b)) != -1) {
        sb.append(new String(b, 0, readByte));
      }
      
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bin != null) {
            bin.close();
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
    }
  }
  
  public static void ex04() { 
    
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "ex04.dat");
    DataInputStream din = null;
    try {
      din = new DataInputStream(new FileInputStream(file));
      
      char ch1 = din.readChar();
      char ch2 = din.readChar();
      char ch3 = din.readChar();
      int age = din.readInt();
      double height = din.readDouble();
      String school = din.readUTF();
      
      System.out.println("" + ch1 + ch2 + ch3);
      System.out.println(age);
      System.out.println(height);
      System.out.println(school);
      
      StringBuilder sb = new StringBuilder();
      
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(din != null) {
            din.close();
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
    }
  }
  
  public static void ex05() { 
    
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "ex05.dat");
    ObjectInputStream oin = null;
    try {
      oin = new ObjectInputStream(new FileInputStream(file));
      
      Student s = (Student) oin.readObject();
 
      System.out.println(s.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if(oin != null) {
          oin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    
  }
}
