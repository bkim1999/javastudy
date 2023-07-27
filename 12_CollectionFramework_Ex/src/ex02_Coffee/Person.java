package ex02_Coffee;

import java.util.ArrayList;
import java.util.List;

public class Person {
  
  private List<Cup> tray;
  
  public Person() {
    tray = new ArrayList<Cup>();
  }
  
  public List<Cup> getTray() {
    return tray;
  }

  public void setTray(List<Cup> tray) {
    this.tray = tray;
  }

  public void addCupToTray(Cup cup) {
    tray.add(cup);
  }
  
  public void trayInfo() {
    for(int i = 0, length = tray.size(); i < length; i++) {
      System.out.println((i + 1) + "번째 커피 : " + tray.get(i).getCoffee());
    }
  }
  
}