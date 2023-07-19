package ex05_access_modifier;

/*
 * 접근 제어 지시자
 * 1. private : 같은 클래스
 * 2. default : 같은 패키지
 * 3. protected : 같은 패키지 or 상속 관계 클래스
 * 4. public : 어디서든
 * 
 * 정보 은닉
 * 1. 필드를 외부에 직접 노출X
 * 2. 정보를 안전하게 관리
 * 3. Java에서는 필드는 private, 메소드는 public 처리
 * 4. 필드에 접근하려면 메소드를 통해서
 */

public class User {
  private String id;
  private int age;
  
  public void setId(String userId) {
    id = userId;
  }
  
  public String getId() {
    return id;
  }
  
  public void setAge(int userAge) {
    age = userAge;
  }
  
  public int getAge() {
    return age;
  }
}