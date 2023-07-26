package ex10_Walkable;

public class Pet {
  
  private String name;
  
  public Pet(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return "멋있는 " + name;
  }
}
