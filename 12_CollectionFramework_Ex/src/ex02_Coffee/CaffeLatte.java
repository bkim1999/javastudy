package ex02_Coffee;

public class CaffeLatte implements Coffee{

  private String name;

  public CaffeLatte(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CaffeLatte [name=" + name + "]";
  }
  
  
}
