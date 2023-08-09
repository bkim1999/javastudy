package ex01_web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MainWrapper {

  public static void ex01(){
    /*
     * Uniform Resource Location
     * 프로토콜://호스트/URLMapping?파라미터=값%\&파라미터=값&파라미터=값
     * https://www.google.com/search?q=%ED%8F%AD%EC%97%BC&oq=%ED%8F%AD%EC%97%BC&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDIGCAMQABgDMgYIBBAAGAMyDQgFEAAYgwEYsQMYgAQyBggGEAAYAzIICAcQABgDGAoyBggIEAAYAzIGCAkQABgD0gEIMzA3NGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8
     * 1. 프로토콜 : 통신규약, https : 보안처리된 하이퍼텍스트 전송 프로토콜
     * 2. 호스트 : 서버 이름
     * 3. URLMapping : 서버 경로
     * 4. 파라미터 : 서버로 보내는 데이터
     * 
     * java.net.URL
     * URL 관리, 분석, URLConnection 생성
     */
    
    String apiURL = "https://www.google.com/search?q=%ED%8F%AD%EC%97%BC&oq=%ED%8F%AD%EC%97%BC&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDIGCAMQABgDMgYIBBAAGAMyDQgFEAAYgwEYsQMYgAQyBggGEAAYAzIICAcQABgDGAoyBggIEAAYAzIGCAkQABgD0gEIMzA3NGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8";
    URL url = null;
    
    try {
      url = new URL(apiURL);
      System.out.println("프로토콜: " + url.getProtocol());
      System.out.println("호스트: " + url.getHost());
      System.out.println("파라미터: " + url.getQuery());
    } catch(MalformedURLException e) {
      System.out.println("형식 오류");
    }
  }
  
  public static void ex02(){
    String spec = "https://ssl.pstatic.net/melona/libs/1456/1456783/898e76d144db9d4e9b18_20230803175043725.jpg";
    URL url = null;
    HttpURLConnection con = null;
    try {
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      int responseCode = con.getResponseCode();
      System.out.println("접속 여부: " + (responseCode == HttpURLConnection.HTTP_OK));
      
      String userAgent = con.getRequestProperty("User-Agent");
      System.out.println(userAgent);
      String referer = con.getRequestProperty("Referer");
      System.out.println(referer);
      String contentType = con.getContentType();
      System.out.println(contentType);
      int contentLength = con.getContentLength();
      System.out.println(contentLength);
      
      
      String requestMethod = con.getRequestMethod();
      System.out.println(requestMethod );
      
      con.disconnect();
      
    } catch(MalformedURLException e) {
      System.out.println("접속 주소 오류");
    } catch(IOException e) {
      System.out.println("접속 오류");
    }
  }
  
  public static void ex03(){
    String spec = "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fi.pinimg.com%2F736x%2F3e%2F38%2Ffd%2F3e38fd6306f28c11d990b29a9ef4ca35.jpg&type=a340";
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    try {
      // HttpURLConnection 생성
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      
      // InputStream 생성
      bin = new BufferedInputStream(con.getInputStream());
      byte[] b = new byte[1024];
      int readByte = 0;
      
      // 출력할 파일 생성
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      String contentType = con.getContentType();
      String extName = contentType.substring(contentType.indexOf("/") + 1);
      File file = new File(dir, "갓민지." + extName);
      
      // OutputStream 생성
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      // 쓰기
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      
      System.out.println(file + " 생성 완료!");
      
    } catch(MalformedURLException e) {
      System.out.println("접속 주소 오류");
    } catch(IOException e) {
      System.out.println("접속 오류");
    } finally {
        try {
          if(bout != null) { bout.close(); }
          if(bin != null) { bin.close(); }
          if(con != null) { con.disconnect(); }          
        } catch(IOException e) {
            e.printStackTrace();
        }
      }
    }
  
  public static void ex04(){
    String spec = "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fi.pinimg.com%2F736x%2F3e%2F38%2Ffd%2F3e38fd6306f28c11d990b29a9ef4ca35.jpg&type=a340";
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    try {
      
      String originData = "뉴진스 민지";
      System.out.println("원본: " + originData);
      String encodeData = URLEncoder.encode(originData, "UTF-8");
      System.out.println("암호: " + encodeData);
      String decodeData = URLDecoder.decode(encodeData, "UTF-8");
      System.out.println("복호: " + decodeData);
      
    } catch(UnsupportedEncodingException e) {
      System.out.println("인코딩 오류");
    }
    
  }
  
  public static void main(String[] args) {
    ex04();
  }

}
