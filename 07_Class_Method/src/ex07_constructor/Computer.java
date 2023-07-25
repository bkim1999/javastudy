package ex07_constructor;

/*
 * 생성자
 * 1. 객체를 생성할 때 사용하는 메소드
 * 2. new 키워드 이후에 호출된다.
 * 3. 특징
 *  1) 생성자도 메소드임
 *  2) 생성자의 이름은 클래스 이름과 같다.
 *  3) 메소드의 반환이 존재하지 않음.
 *  4) 파라미터는 일반 메소드와 동일하게 이용 가능. 오버로딩 가능.
 *  생성자를 안 만들면 Java가 만든 "디폴트 생성자"가 사용됨.
 *  
 *  디폴트 생성자
 *  1. 개발자가 생성자를 하나도 않았ㄷ다면 Java가 자동생성한다.
 *  2. 파라미터가 없고, 본문이 비어있음
 *  3. 기본 필드값을 가진 객체를 생성할 떄 사용됨
 */
public class Computer {
  private String model;
  
  public Computer() {
    System.out.println("Computer() 생성자가 호출됨");
  }
  
  public Computer(String model) {
    this.model = model;
  }
  
  public void setModel(String model) {
    this.model = model;
  }
  
  public String getModel() {
    return model;
  }
  
}
