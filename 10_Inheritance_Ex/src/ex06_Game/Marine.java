package ex06_Game;

public class Marine extends GameUnit{

  private final int POWER = 50;
  
  public Marine(String name) {
    super(name);
    this.setPower(POWER);
  }
}
