package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class MainWrapper {

  public static void main(String[] args) {
    // data.go.kr "한국전력공사_전기차 충전소"에서 "C:/storage/한국전력공사_전기차_충전소_운영정보.xml"로 저장
  
   
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;
    
    try {
       String spec = "http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList";
       String serviceKey = "9mcloRM8hnoYj+vJFTIY56POj/L+CIkIbCZhH53bBG2xy07cmr2QbGephNGWN0TZgBNPLmNERY4piXCDV1I/4A==";
       String pageNo = "1";
       String numOfRows = "10";
       
       StringBuilder sb = new StringBuilder();
       sb.append(spec);
       sb.append("?serviceKey=").append(URLEncoder.encode(serviceKey, "UTF-8"));
       sb.append("&pageNo=").append(URLEncoder.encode(pageNo, "UTF-8"));
       sb.append("&numOfRows=").append(URLEncoder.encode(numOfRows, "UTF-8"));
       
       url = new URL(sb.toString());
       System.out.println(sb.toString());
       con = (HttpURLConnection) url.openConnection();
       int responseCode = con.getResponseCode();
       if(responseCode != HttpURLConnection.HTTP_OK) {
         throw new RuntimeException(responseCode + " 발생");
       }
       System.out.println("응답 코드 : " + responseCode);
       
       reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
       
       StringBuilder sbuf = new StringBuilder();
       String line = null;
       while((line = reader.readLine()) != null) {
         sbuf.append(line + "\n");
       }
       
       File dir = new File("C:/storage");
       if(dir.exists() == false) {
         dir.mkdirs();
       }
       File file = new File(dir, "한국전력공사_전기차_충전소_운영정보.xml");
       writer = new BufferedWriter(new FileWriter(file));
       writer.write(sbuf.toString());
       
       System.out.println(file + " 저장 완료!");
       
    } catch(UnsupportedEncodingException e) {
      System.out.println(e.getMessage());
    } catch (MalformedURLException e) {
      System.out.println("API 주소 오류");
    } catch (IOException e) {
      e.printStackTrace();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(writer != null) writer.close();
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }

}
