package ex05_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    Bank bank = new Bank("국민은행가산지점", "02-111-1111");
    bank.info();  // 국민은행가산지점(02-111-1111)

    BankAccount acc = new BankAccount(bank, "012-34-56789", 200000000);
    acc.info();  // 계좌번호: 012-34-56789, 통장잔액: 50000원
                 // 개설지점: 국민은행가산지점(02-111-1111)
    
    BankMember member = new BankMember("김민지", acc);
    member.info();  // 고객명: 홍길동
                    // 계좌번호: 012-34-56789, 통장잔액: 50000원
                    // 개설지점: 국민은행가산지점(02-111-1111
    
    Bank bank1 = new Bank();
    bank1.setName("국민은행");
    bank1.setTel("01-011-0111");
    
    BankAccount acc1 = new BankAccount();
    acc1.setBank(bank1);
    acc1.setAccNo("111-111-1111");
    acc1.setBalance(50000);
    
    BankMember member1 = new BankMember(); 
    member1.setName("하니");
    member1.setAcc(acc1);

    System.out.println();
    System.out.println("고객명: " + member1.getName());
    System.out.println("계좌번호: " + member1.getAcc().getAccNo());
    System.out.println("통장잔액: " + member1.getAcc().getBalance());
    System.out.println("개설지점: " + member1.getBank().getName());
    System.out.println("지점연락처: " + member1.getBank().getTel());
    
    
    
    
    Bank bank2 = new Bank();
    bank2.setName("농협");
    bank2.setTel("20-0666-0618");
    
    BankAccount acc2 = new BankAccount();
    acc2.setBank(bank2);
    acc2.setAccNo("333-33-3333");
    acc2.setBalance(30000);
    
    BankMember member2 = new BankMember(); 
    member2.setName("강해린");
    member2.setAcc(acc2);
    
    System.out.println();
    System.out.println("고객명: " + member2.getName());
    System.out.println("계좌번호: " + member2.getAcc().getAccNo());
    System.out.println("통장잔액: " + member2.getAcc().getBalance());
    System.out.println("개설지점: " + member2.getBank().getName());
    System.out.println("지점연락처: " + member2.getBank().getTel());
    
    member1.transfer(member2, 10000);
    member1.info();
    member2.info();
    
  }

}