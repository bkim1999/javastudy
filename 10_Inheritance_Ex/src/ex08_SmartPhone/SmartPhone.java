package ex08_SmartPhone;

public class SmartPhone extends Camera implements Computer, Phone{

  @Override
  public void call() {
    System.out.println("전화");

  }

  @Override
  public void sms() {
    System.out.println("메시지");
  }

  @Override
  public void game() {
    System.out.println("게임");
  }

  @Override
  public void internet() {
    System.out.println("인터넷중...");
  }

}
