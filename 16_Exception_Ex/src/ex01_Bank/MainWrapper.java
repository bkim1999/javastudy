package ex01_Bank;

public class MainWrapper {

  public static void main(String[] args) {
    
    try {
      BankAccount acc = new BankAccount(10000, "김민지");
      BankAccount acc2 = new BankAccount(10000, "팜하니");
      acc.deposit(1000);
      acc.withdraw(5000);
      acc.transfer(acc2, 100);
      acc.inquiry();
      acc2.inquiry();
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }

}