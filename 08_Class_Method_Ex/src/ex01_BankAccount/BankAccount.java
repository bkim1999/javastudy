package ex01_BankAccount;

/**
 * 
 * 입금, 출금, 계좌조회, 이체 기능을 제공하는 클래스
 * 
 * @author 김범철
 * @since 2023.07.19
 *
 */
public class BankAccount {
  
  /**
   * long balance 이 필드는 계좌 잔액이다.<br>
   * 초깃값으로 0이 저장된다.
   */
  private long balance;
  

  /** 
   * String accNo 이 필드는 계좌 번호이다.<br>
   * 초깃값으로 null이 저장된다.
   */
  private String accNo;
  
  
  /**
   * 계좌번호와 잔액을 조회하는 메소드
   */
  public void inquiry() {
    System.out.println("계좌번호: " + getAccountNumber());
    System.out.println("잔액: " + getBalance() + "원");
  }
  
  /**
   * 입금 메소드<br> 
   * 파라미터 amount가 0보다 작거나 같으면 동작하지 않는다.
   * @param amount 입금할 금액
   */
  public void deposit(long amount) {
    if(amount <= 0) {
      return;
    }
    balance += amount;
  }
  
  /**
   * 출금 메소드<br>
   * 파라미터 amount가 0보다 작거나 같으면 출금된 금액이 없으므로 0을 반환한다.<br>
   * 파라미터 amount가 통장잔액(balance)보다 크면 출금된 금액이 없으므로 0을 반환한다.
   * @param amount 출금할 금액
   * @return 실제로 출금된 금액
   */
  public long withdraw(long amount) {
    long retVal = 0;
    if(amount <= 0 || amount > balance) {
      return retVal;
    } else {
      balance -= amount;
      retVal = amount;
    }
    return retVal;
  }


  public long getBalance() {
    return balance;
  }
  
  public String getAccountNumber() {
    return accNo;
  }
  
  public void setAccountNumber(String an) {
    accNo = an;
  }
  
  public void transfer(BankAccount account, long amount) {
    long withdraw = this.withdraw(amount);
    account.deposit(withdraw);
  }
}
