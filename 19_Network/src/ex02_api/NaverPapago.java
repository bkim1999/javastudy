package ex02_api;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONObject;

public class NaverPapago {

  public static void main(String[] args) {

    URL url = null;
    HttpURLConnection con = null;
    BufferedOutputStream bout = null;
    BufferedReader reader = null;
    try {
          Scanner sc = new Scanner(System.in);
          System.out.println("한국어 입력 >>> ");
          String text = sc.nextLine();
          
          String spec = "https://openapi.naver.com/v1/papago/n2mt";
          String clientId = "Xk1dzDD4xWwGJRSkQWGL";
          String clientSecret = "mdqqoeOWZH";
          
          String params = "source=ko&target=en&text=" + text;
          
          url = new URL(spec);
          con = (HttpURLConnection) url.openConnection();
          

          con.setRequestMethod("POST");
          con.setRequestProperty("X-Naver-Client-Id", clientId);
          con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
          
          con.setDoOutput(true);
          
          bout = new BufferedOutputStream(con.getOutputStream());
          bout.write(params.getBytes());
          bout.flush();

          int responseCode = con.getResponseCode();
          if(responseCode != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException(responseCode + " 발생!");
          }
          
    
          reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
          
          StringBuilder sb = new StringBuilder();
          String line = null;
          while((line = reader.readLine()) != null) {
            sb.append(line);
          }
          
          JSONObject obj = new JSONObject(sb.toString());
          JSONObject message = obj.getJSONObject("message");
          JSONObject result = message.getJSONObject("result");
          String translatedText = result.getString("translatedText");
          
          System.out.println("번역 결과");
          System.out.println("---------");
          System.out.println(translatedText);
          
    } catch(Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) reader.close();
        if(bout != null) bout.close();
        if(con != null) con.disconnect();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}
