package ex02_has_a;

public class MainWrapper {
  public static void main(String[] args) {

    Tv tv = new Tv();
    
    tv.current();
    tv.setCh(99);
    tv.upCh();
    tv.current();
    
    tv.setCh(0);
    tv.downCh();
    tv.current();
    
    tv.setVol(10);
    tv.upVol();
    tv.current();
    
    tv.setVol(0);
    tv.downVol();
    tv.current();
  }
}
