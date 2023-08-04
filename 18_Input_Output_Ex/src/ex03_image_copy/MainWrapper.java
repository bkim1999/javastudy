package ex03_image_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 문제. %ORA_HOME%/oui/instImages/bg.jpg 이미지 파일을 C:/storage/bg.jpg 이미지로 복사하시오.
    // %ORA_HOME%은 C:/app/사용자/product/18.0.0/dbhomeXE 디렉터리를 의미한다.
    
    File dir1 = new File("C:/app/GDJ/product/18.0.0/dbhomeXE/oui/instImages");
    File src = new File(dir1, "bg.jpg");
    
    File dir2 = new File("C:/storage");
    if(dir2.exists() == false) {
      dir2.mkdirs();
    }
    File copy = new File(dir2, "bg.jpg");
    
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    try {
      
      bin = new BufferedInputStream(new FileInputStream(src));
      bout = new BufferedOutputStream(new FileOutputStream(copy));
      
      byte[] b = new byte[1024];
      int readByte = 0;
      
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }

      System.out.println(src + " → " + copy);
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) { bout.close(); }
        if(bin != null) { bin.close(); }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }

}