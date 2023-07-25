package ex03_Soldier;

public class MainWrapper {

  public static void main(String[] args) {
    // Soldier s = new Soldier(30);
    
    Gun gun = new Gun(30);
    
    Soldier s = new Soldier(gun);
    
    s.reload(30);
    s.reload(20);
    
    for(int i = 0; i < 50; i++) {
      s.shoot();
    }
    
    s.shoot();
  }
  
}

  