package ex07_Class;

import java.util.Objects;

/*
 * java.lang.Object 클래스
 * 1. 최상위 슈퍼클래스
 * 2. 슈퍼클래스 없는 클래스들은 모두 Object의 서브클래스
 * 3. 모든 객체는 Object로 저장 가능
 * 4. Object 타입으로 저장하면 Object 클래스의 메소드만 호출할 수 있다.
 *    헤결책 : DOWNCASTING
 */

public class Person {
  
  private String name;
  private int age;
  
  public Person() {
    
  }
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    return age == other.age && Objects.equals(name, other.name);
  }
   
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}  