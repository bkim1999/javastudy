package ex05_BankAccount;

public class BankAccount {
  
  private Bank bank;
  private String accNo;
  private long balance;
  
  public BankAccount() {};
  
  public BankAccount(Bank bank, String accNo, long balance) {
    this.bank = bank;
    this.accNo = accNo;
    this.balance = balance;
  }
  
  public void setBank(Bank bank) {
    this.bank = bank;
  }
  
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  public Bank getBank() {
    return this.bank;
  }
  
  public String getAccNo() {
    return this.accNo;
  }
  
  public long getBalance() {
    return this.balance;
  }
  
  public void deposit(long money) {
    if(money <= 0) {
      return;
    }
    this.balance += money;
  }
  
  public long withdraw(long money) {
    long retVal = 0;
    if(money > 0 && this.balance >= money) {
      this.balance -= money;
      retVal = money;
    }
    return retVal;
  }
  
  public void transfer(BankAccount acc, long money) {
    long transferred = this.withdraw(money);
    acc.deposit(transferred);
  }
  
  public void info() {
    System.out.println("계좌번호: " + accNo + ", 통장잔액: " + balance + "원");
    System.out.print("개설지점: ");
    bank.info();
  }
}

