package ex06_Game;

public class MainWrapper {

  public static void main(String[] args) {
    
    GameUnit unit1 = new Marine("마린");
    GameUnit unit2 = new Firebat("파이어뱃");
    
    unit1.setHp(500);
    unit2.setHp(450);
    
    boolean myTurn = false;
    
    while(unit1.isAlive() && unit2.isAlive()) {
      System.out.println("========= 턴 시작! =========");
      System.out.println(unit1.getName() + " (HP " + unit1.getHp() + ")  VS  " + unit2.getName() + " (HP " + unit2.getHp() + ")");
      if(myTurn == false) {
        unit1.attack(unit2);
      }
      else {
        unit2.attack(unit1);
      }
      

      System.out.println(unit1.getName() + " (HP " + unit1.getHp() + ")  VS  " + unit2.getName() + " (HP " + unit2.getHp() + ")");
      System.out.println("========= 턴 교체! =========");
      
      myTurn = !myTurn;
      
    }
    
    System.out.println("=== Game Over ===");
   
    if(unit1.isAlive()) {
      System.out.println(unit1.getName() + "의 승리! 남은 HP " + unit1.getHp());
    }
    else {
      System.out.println(unit2.getName() + "의 승리! 남은 HP " + unit2.getHp());
    }
  }

}
