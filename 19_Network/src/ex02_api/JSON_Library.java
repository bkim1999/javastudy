package ex02_api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSON_Library {

  /*
   * JSON 공식 홈페이지
   * 1. http://www.json.org/
   * 2. JSON-JAVA
   */
  
  /*
   * JSON
   * 1. JavaScript Object Notation
   *    자바스크립트 객체 표기법
   * 2. 배열 = [ 1, 2, 3, ... ]
   * 3. 객체 = { 속성 : 값 }
   * 
   */
  
  /*
   *  JSON-JAVA
   *  1. JSONObject : 객체 처리용
   *  2. JSONArray : 배열 처리용
   */
  
  public static void ex01() {
   
    JSONObject obj = new JSONObject();
    obj.put("name", "김민지");
    obj.put("age", 20);
    obj.put("height", 170.0);

    System.out.println(obj.toString());
   
  }
  
  public static void ex02() {
    
    JSONObject obj1 = new JSONObject();
    obj1.put("name", "김민지");
    obj1.put("age", 20);
    obj1.put("height", 170.0);
    
    JSONObject obj2 = new JSONObject();
    obj2.put("name", "팜하니");
    obj2.put("age", 20);
    obj2.put("height", 165.0);
    
    JSONArray array = new JSONArray();
    array.put(obj1);
    array.put(obj2);
    
    System.out.println(array.toString());
    
  }
  
  public static void ex03() {
    
    String str = "{\"name\":\"다니엘\",\"age\":19,\"height\":170}";
    JSONObject obj = new JSONObject(str);
     
    String name = obj.getString("name");
    int age = obj.getInt("age");
    double height = obj.getDouble("height");
    
    System.out.println(name + " " + age + " " + height);
    
  }
  
  public static void ex04() {
    
    String str = "[{\"name\":\"김민지\",\"age\":20,\"height\":170},{\"name\":\"팜하니\",\"age\":20,\"height\":165}]";
    JSONArray array = new JSONArray(str);
    
    for(int i = 0; i < array.length(); i++) {
      System.out.println(array.getJSONObject(i));
    }
    
    for(Object obj : array) {
      System.out.println((JSONObject) obj);
    }
    
  }
  
  public static void ex05() {
    
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("name", "강해린");
    map.put("age", 18);
    map.put("height", 160.0);

    JSONObject obj = new JSONObject(map);
    
    System.out.println(obj);
    
  }
  
  public static void ex06() {

    Map<String, Object> map1 = new HashMap<String, Object>();
    Map<String, Object> map2 = new HashMap<String, Object>();
    map1.put("name", "팜하니");
    map1.put("age", 20);
    map1.put("height", 160.0);
    map2.put("name", "이혜인");
    map2.put("age", 16);
    map2.put("height", 175.0);
    
    List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
    list.add(map1);
    list.add(map2);
    
    JSONArray array = new JSONArray(list);
    
    for(int i = 0; i < array.length(); i++) {
      System.out.println(array.getJSONObject(i));
    }
    
  } 
  
  public static void main(String[] args) {
    ex06();
  }
}
