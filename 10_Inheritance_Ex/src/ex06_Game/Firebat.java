package ex06_Game;

public class Firebat extends GameUnit{
  
  private final int POWER = 80;
  
  public Firebat(String name) {
    super(name);
    this.setPower(POWER);
  }
  
}