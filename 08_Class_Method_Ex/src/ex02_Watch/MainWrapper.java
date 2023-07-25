package ex02_Watch;

public class MainWrapper {

  public static void main(String[] args) {
    
    Watch watch = new Watch();
    
    watch.setHour(9);
    watch.setMinute(40);
    watch.setSecond(30);
    
    watch.addHour(25);      // 1일 1시간
    watch.addMinute(61);    // 1시간 1분
    watch.addSecond(3661);  // 1시간 1분 1초
        
    // 시각 - 12:42:31
    System.out.println("시각 - " + watch.getHour() + ":"
                                + watch.getMinute() + ":"
                                + watch.getSecond());
  }

}