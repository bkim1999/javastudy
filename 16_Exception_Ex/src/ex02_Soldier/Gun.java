package ex02_Soldier;

public class Gun {
  
  private int bullet;
  private final int MAX_BULLET = 50;
  
  public Gun(int bullet) throws RuntimeException{
    if(bullet > MAX_BULLET) {
      throw new RuntimeException("탄약 과다!");
    }
    this.bullet = bullet;
  }
  

  public void reload(int bullet) throws RuntimeException {
    if(this.bullet + bullet > MAX_BULLET) {
      throw new RuntimeException(bullet + "발 장전 불가능!");
    }
    this.bullet += bullet;
    System.out.println(bullet + "발 장전 완료! 남은 탄약 " + this.bullet + "발!");
  }
  
  public void shoot() throws RuntimeException {
    if(bullet == 0) {
      throw new RuntimeException("탄약 부족!");
    }
    bullet--;
    System.out.println("탕---! 남은 탄약 " + this.bullet + "발!");
  }

}
