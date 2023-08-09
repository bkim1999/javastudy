package ex02_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Temp {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String query = null;
    System.out.println("검색어 입력하세요 >>> ");
    query = sc.nextLine();
    try {
      query = URLEncoder.encode(query, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      System.out.println("검색어 인코딩 실패!");
    }
    
    String spec = "https://openapi.naver.com/v1/search/blog.json?query=" + query;

    String clientId = "Xk1dzDD4xWwGJRSkQWGL";
    String clientSecret = "mdqqoeOWZH";
    Map<String, String> requestHeaders = new HashMap<String, String>();
    requestHeaders.put("X-Naver-Client-Id", clientId);
    requestHeaders.put("X-Naver-Client-Secret", clientSecret);
    
    String result = get(spec, requestHeaders);
    System.out.println(result);
    
  }
  
  private static String get(String spec, Map<String, String> requestHeaders) {
    String result = null;
    HttpURLConnection con = connect(spec);
    try {
      con.setRequestMethod("GET");
      for(Entry<String, String> header : requestHeaders.entrySet()) {
        con.setRequestProperty(header.getKey(), header.getValue());
      }
      
      int responseCode = con.getResponseCode();
      if(responseCode == HttpURLConnection.HTTP_OK) {
        result = readBody(con.getInputStream());
      } else {
        result = readBody(con.getErrorStream());
      }
    } catch (IOException e) {
      throw new RuntimeException("요청 실패", e);
    } finally {
      con.disconnect();
    }
    
    return result;
  }
  
  private static HttpURLConnection connect(String spec) {
    URL url = null;
    HttpURLConnection con = null;
    try {
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection(); 
    } catch (MalformedURLException e) {
      throw new RuntimeException("URL 주소 오류 + " + url);
    } catch (IOException e) {
      throw new RuntimeException("연결 실패 : " + url);
    } 
    
    return con;
  }
  
  private static String readBody(InputStream inputStream) {
    StringBuilder sb = null;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
      sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line).append("\n");
      }
    } catch (IOException e) {
      throw new RuntimeException("응답 실패");
    }
    
    return sb.toString();
  }

}
