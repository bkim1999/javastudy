package ex05_upcasting;

public class Alba extends Student {
  
  private String work;
  
  public Alba() {
    
  }
  
  public Alba(String name, String school, String work) {
    super(name, school);
    this.work = work;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }
  
  @Override
  public void working() {
    System.out.println("알바중...");
  }
  
  @Override
  public void info() {
    super.info();
    System.out.println("직장: " + work);
  }
  
}