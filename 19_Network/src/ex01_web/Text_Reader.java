package ex01_web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Text_Reader {

  public static void main(String[] args) {
    
    // 웹 상의 텍스트 파일 읽기 (XML)
    
    String strURL = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
    
    String result = get(strURL);
    
    System.out.println(result);
  }
  
  public static String get(String strURL) {
    
    HttpURLConnection con = connect(strURL);
    
    try {
      int responseCode = con.getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
        return readBody(con.getInputStream());
      } else {
        return readBody(con.getErrorStream());
      }
    } catch (IOException e) {
      throw new RuntimeException("응답 실패");
    } finally {
      con.disconnect();
    }
  }
  
  public static HttpURLConnection connect(String strURL) {
    try {
      URL url = new URL(strURL);
      return (HttpURLConnection) url.openConnection();
    } catch (MalformedURLException e) {
      throw new RuntimeException("URL이 잘못되었습니다. : " + strURL, e);
    } catch (IOException e) {
        throw new RuntimeException("연결이 실패했습니다. : " + strURL, e);
    }
  }
  
  public static String readBody(InputStream inputStream) {
    InputStreamReader streamReader = new InputStreamReader(inputStream);
    
    try(BufferedReader reader = new BufferedReader(streamReader)){
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line).append("\n");
      }
      return sb.toString();
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
  }

}