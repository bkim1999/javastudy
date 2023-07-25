package ex07_constructor;

public class MainWrapper {

  public static void main(String[] args) {
    Computer myCom;
    myCom = new Computer();
    
    myCom.setModel("gram");
    
    System.out.println(myCom.getModel());
    
    Computer youCom = new Computer("macbook");
        
    System.out.println("yourComputer : " + youCom.getModel());
  }

}