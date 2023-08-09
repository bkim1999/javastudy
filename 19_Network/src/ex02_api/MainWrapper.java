package ex02_api;

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

import org.json.JSONArray;
import org.json.JSONObject;

public class MainWrapper {
  
  public static void ex01() {
    /*
     * 한국환경공단 에어코리아 대기오염정보 시도별 실시간 측정정보 조회
     * 1. 요청주소: http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty
     * 2. 요청변수(Request Parameter): 
     *    1) serviceKey : 필수, 인코딩된 인증키
     *    2) returnType : 선택, xml / json
     *    3) numOfRows : 선택, 100
     *    4) pageNo : 선택, 1
     *    5) sidoName : 필수, 서울
     *    6) ver : 선택, 1.0
     */

    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;
    
    try {
      
      String spec = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
      String serviceKey = "9mcloRM8hnoYj+vJFTIY56POj/L+CIkIbCZhH53bBG2xy07cmr2QbGephNGWN0TZgBNPLmNERY4piXCDV1I/4A==";
      String returnType = "json";
      String numOfRows = "100";
      String pageNo = "1";
      String sidoName = "서울";
      String ver = "1.0";
      
      StringBuilder sb = new StringBuilder();
      sb.append(spec);
      sb.append("?serviceKey=").append(URLEncoder.encode(serviceKey, "UTF-8")); // UnsupportedEncodingException
      sb.append("&returnType=").append(returnType);
      sb.append("&numOfRows=").append(numOfRows);
      sb.append("&pageNo=").append(pageNo);
      sb.append("&sidoName=").append(URLEncoder.encode(sidoName, "UTF-8"));
      sb.append("&ver=").append(ver);

      url = new URL(sb.toString());                   // MalformedURLExcpetion
      con = (HttpURLConnection) url.openConnection(); // IOExcpeiton

      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }

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
      File file = new File(dir, "시도별_실시간_측정정보_조회." + returnType);
      writer = new BufferedWriter(new FileWriter(file));
      writer.write(sbuf.toString());
      
      System.out.println(file.getPath() + " 파일 생성 완료!");
             
    } catch(UnsupportedEncodingException e) {
      System.out.println(e.getMessage());
    } catch(MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(writer != null) writer.close();
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex02() {
    /*
     *  네이버개발자센터 = 검색(블로그)
     *  1. 요청주소: https://openapi.naver.com/v1/search/blog.json
     *  2. 요청변수
     *    1) query    : 필수, (검색어)
          2) display  : 선택
          3) start    : 선택
          4) sort     : 선택
     */
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    
    try {
    
      String spec = "https://openapi.naver.com/v1/search/blog.json";
      String query = "뉴진스 민지";
      String display = "10";
      String start = "1";
      String sort = "sim";
      String clientId = "Xk1dzDD4xWwGJRSkQWGL";
      String clientSecret = "mdqqoeOWZH";
      
      StringBuilder sbUrl = new StringBuilder();
      sbUrl.append(spec);
      sbUrl.append("?query=").append(URLEncoder.encode(query, "UTF-8"));
      sbUrl.append("&display=").append(display);
      sbUrl.append("&start=").append(start);
      sbUrl.append("&sort=").append(sort);
      
      url = new URL(sbUrl.toString());
      con = (HttpURLConnection) url.openConnection();

      con.setRequestMethod("GET");  
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) throw new RuntimeException("응답코드: " + responseCode);
      
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }

      JSONObject obj = new JSONObject(sb.toString());
      JSONArray items = obj.getJSONArray("items");
      for(int i = 0, length = items.length(); i < length; i++) {
        JSONObject item = items.getJSONObject(i);
        System.out.println((i+1) + "번째 블로그 검색 결과");
        System.out.println(item.getString("title"));
        System.out.println(item.getString("link"));
        System.out.println(item.getString("description"));
        System.out.println(item.getString("bloggername"));
        System.out.println(item.getString("bloggerlink"));
      }
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    
    
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
