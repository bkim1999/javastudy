package ex01_Person;

import java.util.List;
import java.util.ArrayList;

public class MainWrapper {

  public static void main(String[] args) {
    
    List<Person> family = new ArrayList<Person>();
    
    family.add(new Person("김민지", 20));
    family.add(new Person("팜하니", 20));
    family.add(new Person("다니엘", 19));
    family.add(new Person("강해린", 18));
    family.add(new Person("이혜인", 16));
    
    for(int i = 0, length = family.size(); i < length; i++) {
      System.out.println(family.get(i));
      System.out.println("이름: " + family.get(i).getName());
      System.out.println("나이: " + family.get(i).getAge());
    }
    
  }

}
