package ex02_has_a;

public class Remocon{
  
  private final int MAX_CH = 99;
  private final int MAX_VOL = 10;
  private int ch;
  private int vol;
  
  public void upCh() {
    if(ch == MAX_CH) {
      ch = 0;
      return;
    }
    ch++;
  }
  
  public void downCh() {
    if(ch == 0) {
      ch = MAX_CH;
      return;
    }
    ch--;
  }
  
  public void upVol() {
    if(vol == MAX_VOL) {
      return;
    }
    vol++;;
  }
  
  public void downVol() {
    if(vol == 0) {
      return;
    }
    vol--;
  }
  
  public int getCh() {
    return ch;
  }
  
  public void setCh(int ch) {
    this.ch = ch;
  }
  
  public int getVol() {
    return vol;
  }
  
  public void setVol(int vol) {
    this.vol = vol;
  }
  
  public void current() {
    System.out.println("CH" + ch + "       VOL " + vol);
  }
}
