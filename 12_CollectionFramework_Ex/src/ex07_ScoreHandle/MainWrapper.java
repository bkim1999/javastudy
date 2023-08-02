package ex07_ScoreHandle;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainWrapper {
  public static void main(String[] args) {
    
    ScoreHandler sh = new ScoreHandler();
    
    Map<String, Object> student1 = new HashMap<String, Object>();
    student1.put("name", "김민지");
    student1.put("score", 100);
    sh.addScore(student1);
    Map<String, Object> student2 = new HashMap<String, Object>();
    student2.put("name", "팜하니");
    student2.put("score", 90);
    sh.addScore(student2);
    Map<String, Object> student3 = new HashMap<String, Object>();
    student3.put("name", "다니엘");
    student3.put("score", 80);
    sh.addScore(student3);
    Map<String, Object> student4 = new HashMap<String, Object>();
    student4.put("name", "강해린");
    student4.put("score", 60);
    sh.addScore(student4);
    Map<String, Object> student5 = new HashMap<String, Object>();
    student5.put("name", "이혜인");
    student5.put("score", 30);
    sh.addScore(student5);
    
    Map<String, Number> result = sh.get();
    
    for(Entry<String, Number> e : result.entrySet()) {
      System.out.println(e);
    }
    
  }
}
