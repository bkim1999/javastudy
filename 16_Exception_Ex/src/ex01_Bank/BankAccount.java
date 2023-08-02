package ex01_Bank;

public class BankAccount {
  
  private long balance;
  private String accNo;
  public BankAccount(long balance, String accNo) {
    super();
    this.balance = balance;
    this.accNo = accNo;
  }
  public long getBalance() {
    return balance;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  public String getAccNO() {
    return accNo;
  }
  public void setAccNO(String accNo) {
    this.accNo = accNo;
  }
  public void inquiry() {
    System.out.println("계좌번호: " + accNo);
    System.out.println("잔액: " + balance + "원");
  }
  
  /**
   * 입금 메소드<br> 
   * 파라미터 amount가 0보다 작거나 같으면 동작하지 않는다.
   * @param amount 입금할 금액
   * @exception RuntimException 입금액이 0 이하일 경우 발생한다.
   */
  public void deposit(long amount) throws RuntimeException{
    if(amount <= 0) {
      throw new RuntimeException(amount + "원 입금 불가");
    }
    balance += amount;
  }
  
  /**
   * 출금 메소드<br>
   * 파라미터 amount가 0보다 작거나 같으면 출금된 금액이 없으므로 0을 반환한다.<br>
   * 파라미터 amount가 통장잔액(balance)보다 크면 출금된 금액이 없으므로 0을 반환한다.
   * @param amount 출금할 금액
   * @return 실제로 출금된 금액
   * @exception RuntimException 출금액이 0 이하이거나 잔액 이상일 경우 발생한다.
   */
  public long withdraw(long amount) throws RuntimeException {
    long retVal = 0;
    if(amount <= 0) {
      throw new RuntimeException(amount + "원 출금 불가");
    } else if(amount > balance) {
      throw new RuntimeException("잔액 부족");
    } else {
      balance -= amount;
      retVal = amount;
    }
    return retVal;
  }
  
  /**
   * 이체 메소드<br>
   * 다른 계좌로 이체하는 메소드
   * 내 계좌에서 출금을 먼저 수행사고, 출금된 금액만큼 다른 계좌로 입금한다.
   * @param account 상대 계좌
   * @param amount 이체할 금액
   * @exception RuntimException 송금액이 0 이하이거나 잔액 이상일 경우 발생한다.
   */
  public void transfer(BankAccount account, long amount) throws RuntimeException{
    long withdraw = this.withdraw(amount);
    account.deposit(withdraw);
  }
}
