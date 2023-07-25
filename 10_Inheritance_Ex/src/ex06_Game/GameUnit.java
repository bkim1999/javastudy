package ex06_Game;

public class GameUnit {
  
  private String name;
  private int hp;
  private boolean alive;
  private int power;
  
  public GameUnit(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
    this.setAlive(hp > 0);
  }

  public boolean isAlive() {
    return alive;
  }

  private void setAlive(boolean alive) {
    this.alive = alive;
  }

  public int getPower() {
    return power;
  }
  
  public void setPower(int power) {
    this.power = power;
  }
  
  public void attack(GameUnit gameunit) {
    System.out.println(this.getName() + "이 " + gameunit.getName() + "을 " + this.getPower() + "의 데미지로 공격!");
    gameunit.setHp(gameunit.getHp() - this.getPower());
  }

}
