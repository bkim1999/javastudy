package ex10_Walkable;

public class MainWrapper {

  public static void main(String[] args) {

    Dog dog = new Dog("백구");
    Snake snake = new Snake("블랙맘바");
    
    Person p = new Person();
    
    p.foodFeed(dog, "개사료");
    p.foodFeed(snake, "냉동쥐");
    
    p.walk(dog);
   // p.walk(snake);
  }

}
