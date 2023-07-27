package ex02_Coffee;

import java.util.List;

public class MainWrapper {

  public static void main(String[] args) {

    Cup cup1 = new Cup();
    Cup cup2 = new Cup();
    
    cup1.setCoffee(new Americano("아메아메아메"));
    cup2.setCoffee(new CaffeLatte("라떼는말이야"));
    
    Person p = new Person();
    p.addCupToTray(cup1);
    p.addCupToTray(cup2);
    
    p.trayInfo();
    
  }

}