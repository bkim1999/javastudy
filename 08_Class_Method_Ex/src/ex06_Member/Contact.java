package ex06_Member;

public class Contact {

  private String homeTel, mobile;
  private Address address;
  
  public void setHomeTel(String homeTel) {
    this.homeTel = homeTel;
  }
  
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  
  public void setAddress(Address address) {
    this.address = address;
  }
  
  public String getHomeTel() {
    return this.homeTel;
  }
  
  public String getMobile() {
    return this.mobile;
  }
  
  public Address getAddress() {
    return this.address;
  }
  
  public String toString() {
    return "\n집전화: " + getHomeTel()
         + "\n휴대전화: " + getMobile()
         + getAddress().toString();
  }
  
}
