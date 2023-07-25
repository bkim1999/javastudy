package ex02_Watch;

/**
 * 시, 분, 초 정보를 가지고 있는 시계 클래스
 * addHour, addMinute, addSecond 메소드를 이용해서 시, 분, 초를 조작할 수 있다.
 * @author 김범철
 * @since 2023.07.20
 * @version 1.0
 *
 */
public class Watch {
  /**
   * 시간 정보를 저장하는 필드로 0 ~ 23 사이 값을 가진다.
   */
  private int hour;
  
  /**
   * 분 정보를 저장하는 필드로 0 ~ 59 사이 값을 가진다.
   */
  private int minute;
  
  /**
   * 초 정보를 저장하는 필드로 0 ~ 59 사이 값을 가진다.
   */
  private int second;
  
  public void setHour(int hour) {
    this.hour = hour;
  }
  
  public void setMinute(int minute) {
    this.minute = minute;
  }
  
  public void setSecond(int second) {
    this.second = second;
  }
  
  public int getHour() {
    return hour;
  }
  
  public int getMinute() {
    return minute;
  }
  
  public int getSecond() {
    return second;
  }
  
  /**
   * 필드 hour에 파라미터 addedHour를 더하는 메소드<br>
   * 필드 hour값은 0 ~ 23 사이의 값을 가질 수 있도록 처리한다.<br>
   * 파라미터 값은 0보다 작거나 같으면 처리하지 않는다.
   * 
   * @param addedHour
   */
  public void addHour(int addedHour) {
    if(addedHour <= 0) {
      return;
    }
    hour += addedHour;
    hour %= 24;
  }
  
  /**
   * 필드 minute에 파라미터 addedMinute를 더하는 메소드<br>
   * 필드 minute값은 0 ~ 60 사이의 값을 가질 수 있도록 처리한다.<br>
   * 파라미터 값은 0보다 작거나 같으면 처리하지 않는다.<br>
   * 필드 minute값이 60보다 크거나 같으면 필드 hour값도 증가한다.
   * 
   * @param addedMinute
   */
  public void addMinute(int addedMinute) {
    if(addedMinute <= 0) {
      return;
    }
    minute += addedMinute;
    addHour(minute / 60);
    minute %= 60;
  }
  
  /**
   * 필드 second에 파라미터 addedSecond를 더하는 메소드<br>
   * 필드 second값은 0 ~ 60 사이의 값을 가질 수 있도록 처리한다.<br>
   * 파라미터 값은 0보다 작거나 같으면 처리하지 않는다.<br>
   * 필드 second값이 60보다 크거나 같으면 필드 minute값도 증가한다.
   * 
   * @param addedSecond
   */
  public void addSecond(int addedSecond) {
    if(addedSecond <= 0) {
      return;
    }
    second += addedSecond;
    addMinute(second / 60);
    second %= 60;
  }
}
