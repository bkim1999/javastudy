package ex05_BankAccount;

public class Bank {
  private String name, tel;
  
  public Bank() {};
    
  public Bank(String name, String tel) {
      this.name = name;
      this.tel = tel;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setTel(String tel) {
    this.tel = tel;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getTel() {
    return this.tel;
  }
  
  public void info() {
    System.out.println(this.name + "(" + this.tel + ")");
  }
}
