package ex03_Soldier;

public class Gun {
  
  private int bullet;
  private final int MAX_BULLET = 50;
  
  public Gun(int bullet) {
    this.bullet = bullet > MAX_BULLET ? MAX_BULLET : bullet;
  }
  

  public void reload(int bullet) {
    if(this.bullet + bullet > MAX_BULLET) {
      System.out.println(bullet + "발 장전 불가능!");
      return;
    }
    this.bullet += bullet;
    System.out.println(bullet + "발 장전 완료! 남은 탄약 " + this.bullet + "발!");
  }
  
  public void shoot() {
    if(bullet == 0) {
      System.out.println("탄약 부족!");
      return;
    }
    bullet--;
    System.out.println("탕---! 남은 탄약 " + this.bullet + "발!");
  }

}
