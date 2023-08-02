package ex08_Bakery;

import java.util.HashMap;
import java.util.Map;

public class Bakery {
  public final int PRICE = 2000;
  private int count, money;
  
  public Bakery(int count, int money) {
    this.count = count;
    this.money = money;
  }
  
  public void setCount(int count) {
    this.count = count;
  }
  
  public int getCount() {
    return count;
  }
  
  public void setMoney(int money) {
    this.money = money;
  }
  
  public int getMoney() {
    return money;
  }
  
  /**
   * 판매 메소드<br>
   * 고객으로부터 구매할 빵의 개수와 돈을 전달 받아서 판매한다.
   * @param count 구매할 빵의 개수
   * @param money 빵을 사려고 내는 돈
   * @return 빵과 잔돈
   */
  public Map<String, Integer> sell(int count, int money) {
    
    if(this.count < count) {
      System.out.println("판매 불가: 빵 부족");
      return null;
    }
    
    int total = count * PRICE;
    
    if(money <= 0 || count <= 0) {
      System.out.println("판매 불가: 지불 안 됨 혹은 개수 오류");
      return null;
    }
    
    if(total > money) {
      System.out.println("판매 불가: 액수 미달");
      return null;
    }
    
    int change = money - total;
    
    if(change > this.money) {
      System.out.println("판매 불가: 잔돈 부족");
      return null;
    }
    
    this.count -= count;
    this.money += total;
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("count", count);
    map.put("change", change);
    return map;
    
  }
}
