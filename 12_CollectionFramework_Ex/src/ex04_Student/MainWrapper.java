package ex04_Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainWrapper {

  public static void main(String[] args) {

    Map<String, Student> studentSet = new HashMap<String, Student>();
    
    studentSet.put("10001", new Student("김민지", new Exam(100, 90, 100)));
    studentSet.put("10002", new Student("팜하니", new Exam(30, 100, 100)));
    studentSet.put("10003", new Student("다니엘", new Exam(70, 100, 100)));
    studentSet.put("10004", new Student("강해린", new Exam(100, 40, 60)));
    studentSet.put("10005", new Student("이혜인", new Exam(100, 30, 40)));
    
    for(Entry<String, Student> e : studentSet.entrySet()) {
      String key = e.getKey();
      Student value = e.getValue();
      System.out.println(key + "  " + value);
      
    }
     
  }

}
