package ex02_json_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainWrapper {
  
  public static void ex01() {
 // C:/storage/product.json
    // [ { "code" : "0001", "name" : "냉장고", "price": 100, "sales" : ["하이마트", "전자랜드"] },
    //   { "code" : "0002", "name" : "에어컨", "price": 200, "sales" : ["하이마트"] } ]
     
    Map<String, Object> map1 = new HashMap<String, Object>();
    map1.put("code", "0001");
    map1.put("name", "냉장고");
    map1.put("price", 100);
    map1.put("sales", Arrays.asList("하이마트", "전자랜드"));
    Map<String, Object> map2 = new HashMap<String, Object>();
    map2.put("code", "0002");
    map2.put("name", "에어컨");
    map2.put("price", 200);
    map2.put("sales", Arrays.asList("하이마트"));
    
    List<Map<String, Object>> list = Arrays.asList(map1, map2);
    JSONArray array = new JSONArray(list);
    
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "product.json");
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
      writer.write(array.toString());
      System.out.println(file + " 저장 완료!");
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void ex02() {
    // 문제. 아래 링크에 연결된 JSON 파일을 모두 읽은 뒤 아래 데이터를 가져와서 출력하시오.
    // 가져올 데이터)
    // ○ (강수) 10일(목) 전국에, 11일(금) 오전 수도권과 강원도에 비가 오겠습니다.<br />○ (기온) 이번 예보기간 아침 기온은 23~26도, 낮 기온은 27~33도로 평년(최저기온 22~24도, 최고기온 29~32도)과 비슷하겠습니다. <br />○ (해상) 전해상에 10일(목)까지, 동해상은 11일(금)까지 물결이 1.0~4.0m(동해상과 남해동부해상 5.0m 이상)로 매우 높게 일겠습니다.<br />○ (주말전망) 12일(토)과 13일(일)은 전국이 구름많겠습니다. 아침 기온은 23~26도, 낮 기온은 30~33도가 되겠습니다.

    String spec = "https://gdlms.cafe24.com/uflist/curri/10014/bbs/231_64d09afdc7c01.json";
    
    URL url = null;
    HttpsURLConnection con = null;
    BufferedReader reader = null;
    
    try {
      url = new URL(spec);
      con = (HttpsURLConnection) url.openConnection();
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      JSONObject obj = new JSONObject(sb.toString());
      String wf = obj.getJSONObject("rss")
                      .getJSONObject("channel")
                      .getJSONObject("item")
                      .getJSONObject("description")
                      .getJSONObject("header")
                      .getString("wf");
      System.out.println(wf.replace("<br />", "\n"));
       
    } catch(MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    } finally {
        try {
          if(reader != null) reader.close();
          if(con != null) con.disconnect();
        } catch(IOException e) {
            e.printStackTrace();
        } 
      }
  }
  
  public static void main(String[] args) {
    
     ex02();
  }

}
