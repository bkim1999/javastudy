package ex01_weather;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainWrapper {

  public static void main(String[] args) {
    
    String spec = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    try {
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String line = null;
      StringBuilder sb = new StringBuilder();
      while((line = br.readLine()) != null) {
        sb.append(line);
      }

      File dir = new File("C:/storage");
      if(dir.exists() == false) { dir.mkdirs(); }
      File file = new File(dir, "sfc_web_map.xml");
      bw = new BufferedWriter(new FileWriter(file));
      bw.write(sb.toString());
      
      System.out.println(file + " 생성 완료!");
    } catch(MalformedURLException e) {
      System.out.println("URL 주소 오류");
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bw != null) { bw.close(); }
        if(br != null) { br.close(); }
        if(con != null) { con.disconnect(); }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
  }

}
