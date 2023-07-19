package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    BankAccount rich = new BankAccount();
    BankAccount poor = new BankAccount();
    
    rich.setAccountNumber("부자9999");
    poor.setAccountNumber("거지0000");
    rich.deposit(90000000);
    rich.withdraw(1);
    rich.transfer(poor, 10000000);
    rich.inquiry();
    poor.inquiry();
  }

}