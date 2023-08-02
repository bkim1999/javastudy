package ex05_Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainWrapper {

  public static void main(String[] args) {
    
    Map<String, Object> thread1 = new HashMap<String, Object>();
    thread1.put("제목", "뉴진스가 신인 증거 5가지");
    thread1.put("작성자", "뉴진스팬");
    thread1.put("조회수", 99999);
    
    Map<String, Object> thread2 = new HashMap<String, Object>();
    thread2.put("제목", "뉴진스가 세상을 구한다");
    thread2.put("작성자", "버니즈");
    thread2.put("조회수", 19587);
    
    Map<String, Object> thread3 = new HashMap<String, Object>();
    thread3.put("제목", "뉴진스 평생 안보기 vs 100억 받기 닥후인 이유");
    thread3.put("작성자", "밸런스충");
    thread3.put("조회수", 15368);
    
    List<Map<String, Object>> threadList = new ArrayList<Map<String, Object>>();
    threadList.add(thread1);
    threadList.add(thread2);
    threadList.add(thread3);
    
    for(Map<String, Object> thread : threadList) {
      for(Entry<String, Object> e : thread.entrySet()) {
        String key = e.getKey();
        Object value = e.getValue();
        System.out.print(key + ": " + value + "   ");
      }
      System.out.println();
    }

  }

}