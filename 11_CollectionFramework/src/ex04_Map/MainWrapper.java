package ex04_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainWrapper {
  
  /*
   * HashMap
   * 1. Map 인터페이스를 구현
   * 2. 객체 / 인스턴스를 대신할 수 있음
   * 3. Entry(Key + Value), Key, Value
   * 4. Key 중복 X HashSet 구조
   * 5. Key Value 모두 generic 처리
   */
  
  public static void ex01() {

    Map<String, String> dict;
    
    dict = new HashMap<String, String>();
    
    dict.put("김민지", "KIMMINJI");
    dict.put("팜하니", "PHAMHANNI");
    dict.put("다니엘", "DANIELLE");
    dict.put("강해린", "KANGHAERIN");
    dict.put("이혜인", "LEEHYEIN");
    
    System.out.println(dict.get("김민지"));
    System.out.println(dict.get("이혜인"));
    
  }
  
  public static void ex02() {
    
    Map<String, Object> person = new HashMap<String, Object>();
    
    person.put("name", "김민지");
    person.put("age", 20);
    
    person.put("name", "팜하니");
    
    System.out.println(person.get("name") + "  "  + person.get("age") + "세, 세상을 구하다.");
  }

  public static void ex03() {
    Map<String, Object> map = new HashMap<String, Object>();
    
    map.put("top", 10);
    map.put("bottom", 20);
    map.put("left", 30);
    map.put("right", 40);
    
    Set<String> keys = map.keySet();
    
    Iterator<String> arm = keys.iterator();
    
    while(arm.hasNext()) {
      String key = arm.next();
      Object val = map.get(key);
      System.out.println(key + " : " + val);
    }
  }
  
  public static void ex04() {
    Map<String, Object> map = new HashMap<String, Object>();
    
    map.put("id", "fafafmmo");
    map.put("pw", "superdueprcomputer");
    map.put("role", "DBA");
    
    for(Entry<String, Object> e : map.entrySet()) {
      String key = e.getKey();
      Object value = e.getValue();
      System.out.println(key + ":" + value);
    }
  }
  
  public static void main(String[] args) {
    
      ex04(); 
  }

}
