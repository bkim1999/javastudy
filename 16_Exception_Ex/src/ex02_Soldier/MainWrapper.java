package ex02_Soldier;

public class MainWrapper {

  public static void main(String[] args) {

    try {
      Gun gun = new Gun(30);
      
      Soldier s = new Soldier(gun);
      
      s.reload(20);
      
      for(int i = 0; i < 50; i++) {
        s.shoot();
      }
      
      s.shoot();
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
  }
  
}

  