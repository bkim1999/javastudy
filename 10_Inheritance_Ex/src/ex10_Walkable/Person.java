package ex10_Walkable;

public class Person {
  
  public void foodFeed(Pet pet, String food) {
    System.out.println(pet + "에게 " + food + "를 주었다.");
  }
  
  public void walk(Walkable animal) {
    System.out.println(animal + "와 산책 중...");
  }
}