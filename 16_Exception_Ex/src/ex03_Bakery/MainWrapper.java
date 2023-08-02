package ex03_Bakery;

public class MainWrapper {

  public static void main(String[] args) throws RuntimeException {
    
    Bakery bakery = new Bakery(100, 100000);
        
    Customer customer = new Customer(100000);
    
    customer.buy(bakery, 3, 10000);
    
    System.out.println("빵집 money: " + bakery.getMoney() + "원");
    System.out.println("빵집 빵: " + bakery.getCount() + "개");
    
    System.out.println("고객 money: " + customer.getMoney() + "원");
    System.out.println("고객 빵: " + customer.getCount() + "개");
    
  }

}    