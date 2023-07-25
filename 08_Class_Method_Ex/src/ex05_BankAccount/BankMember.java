package ex05_BankAccount;

public class BankMember {
  
  private String name;
  private BankAccount bankAccount;
  
  public BankMember() {};
  
  public BankMember(String name, BankAccount bankAccount) {
    this.name = name;
    this.bankAccount = bankAccount;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setAcc(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }
  
  public String getName() {
    return this.name;
  }
  
  public BankAccount getAcc() {
    return this.bankAccount;
  }
  
  public Bank getBank() {
    return getAcc().getBank();
  }
  
  public void deposit(long money) {
    bankAccount.deposit(money);
  }
  
  public long withdraw(long money) {
    return bankAccount.withdraw(money);
  }
  
  public void transfer(BankMember member, long money) {
    member.deposit(withdraw(money));
  }
  
  public void info() {
    System.out.println();
    System.out.println("고객명: " + this.name);
    this.bankAccount.info();
  }
}
