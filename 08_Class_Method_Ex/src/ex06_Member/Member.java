package ex06_Member;

public class Member {
  
  private String name;
  private Contact contact;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  public String getName() {
    return name;
  }
  
  public Contact getContact() {
    return contact;
  }
  
  public String toString() {
    return  "\n이름: " + getName() + getContact().toString();
  }
}
