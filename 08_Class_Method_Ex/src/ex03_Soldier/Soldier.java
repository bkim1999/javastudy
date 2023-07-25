package ex03_Soldier;

public class Soldier {
  private Gun gun;
  
  public Soldier(Gun gun) {
    this.gun = gun;
  }
  
  public Soldier(int bullet) {
    this.gun = new Gun(bullet);
  }
  
  public void reload(int bullet) {
    this.gun.reload(bullet);
  }
  
  public void shoot() {
    this.gun.shoot();
  }
  
  
}
