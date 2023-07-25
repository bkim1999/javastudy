package ex08_Bakery;

public class Customer {
  private int count, money;
  
  public Customer(int money) {
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
   * 구매 메소드<br>
   * 고객이 빵을 사는 빵집, 구매할 빵의 갯수와 돈을 전달 받아서 구매한다.<br>
   * Bakery 클래스의 판매 메소드 sell()을 이용해서 구현한다.
   * @param bakery 빵을 구매할 빵집
   * @param count 구매할 빵의 개수
   * @param money 빵을 사려고 내는 돈
   */
  public void buy(Bakery bakery, int count, int money) {
    
    if(this.money < money) {
      System.out.println("가진 돈 부족");
      return;
    }
    
    BreadChange bc = bakery.sell(count, money);
    
    if(bc != null) {
      this.count += bc.getBread();
      this.money -= money;
      this.money += bc.getChange();
    }
  }
    
}

