package ex02_api;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.JSONObject;

// 네이버 캡차 API 예제 - 키발급
public class NaverCaptcha {
  
  static Map<String, String> requestHeaders = new HashMap<String, String>();
  
  private static String get(String apiURL) {
    HttpURLConnection con = connect(apiURL);
    try {
      con.setRequestMethod("GET");
      for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
          con.setRequestProperty(header.getKey(), header.getValue());
      }
      int responseCode = con.getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
          String contentType = con.getContentType();
          if(contentType == null) {
            String jsonKey = readBody(con.getInputStream());
            JSONObject objKey = new JSONObject(jsonKey);
            String key = objKey.getString("key");
            return key;
            
          } else {
            return readImage(con.getInputStream());
          }
      } else { // 에러 발생
          return readBody(con.getErrorStream());
      }
    } catch (IOException e) {
        throw new RuntimeException("API 요청과 응답 실패", e);
    } finally {
        con.disconnect();
    }
  }
  
  private static String getKey() {
    String code = "0";
    String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
    return get(apiURL);
  }
  
  private static String getImage() {
    String key = getKey();
    
    String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
    System.out.println(get(apiURL));
    return key;
  }

  public static void main(String[] args) {
      String clientId = "Xk1dzDD4xWwGJRSkQWGL";
      String clientSecret = "mdqqoeOWZH";

      requestHeaders.put("X-Naver-Client-Id", clientId);
      requestHeaders.put("X-Naver-Client-Secret", clientSecret);
      
      validInput();
  }
  
  private static HttpURLConnection connect(String apiUrl){
      try {
          URL url = new URL(apiUrl);
          return (HttpURLConnection)url.openConnection();
      } catch (MalformedURLException e) {
          throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
      } catch (IOException e) {
          throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
      }
  }

  private static String readBody(InputStream body){
      InputStreamReader streamReader = new InputStreamReader(body);

      try (BufferedReader lineReader = new BufferedReader(streamReader)) {
          StringBuilder responseBody = new StringBuilder();

          String line;
          while ((line = lineReader.readLine()) != null) {
              responseBody.append(line);
          }

          return responseBody.toString();
      } catch (IOException e) {
          throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
      }
  }
  
  private static String readImage(InputStream body) {
    byte[] b = new byte[1024];
    int readByte = 0;
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, System.currentTimeMillis() + ".jpg");
    try (BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file))){
        while((readByte = body.read(b)) != -1) {
          bout.write(b, 0, readByte);
        }
        return file + " 생성 완료!";
    } catch (IOException e) {
        throw new RuntimeException("이미지 파일 생성 실패");
    } 
  }
  
  private static void validInput() {
    String key = getImage();
    Scanner sc = new Scanner(System.in);
    System.out.println("키 입력 >>>");
    String value = sc.next();
    String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
    String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code + "&key=" + key + "&value=" + value;
    HttpURLConnection con = connect(apiURL);
    try {
      con.setRequestMethod("GET");
      for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
          con.setRequestProperty(header.getKey(), header.getValue());
      }
      
      int responseCode = con.getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
          String str = readBody(con.getInputStream());
          JSONObject obj = new JSONObject(str);
          if(obj.getBoolean("result")) System.out.println("맞습니다!");
          else System.out.println("틀립니다!");
      } else { // 에러 발생
          throw new RuntimeException("호출 실패");
      }
    } catch (IOException e) {
        throw new RuntimeException("API 요청과 응답 실패", e);
    } finally {
        con.disconnect();
    }
  }
}