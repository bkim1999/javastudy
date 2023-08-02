package ex03_Bus;

import java.util.List;
import java.util.ArrayList;

public class Bus {
  
  private List<Seat> seats;
  private final int LIMIT = 25;

  public Bus() {
    super();
    this.seats = new ArrayList<Seat>();
    for(int i = 0; i < LIMIT; i++) {
      seats.add(new Seat());
    }
  }
  
  public void getOn(int seatNo, Person person) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println("탑승 실패! " + seatNo + "번 좌석은 존재하지 않는다.");
      return;
    }
    if(seats.get(seatNo - 1).getPerson() != null) {
      System.out.println("탑승 실패! " + seatNo + "번 좌석은 이미 주인이 있다.");
      System.out.println(seats.get(seatNo - 1).getPerson().getName() + ": 이 좌석은 나의 것이오.");
      return;
    }
    seats.get(seatNo - 1).setPerson(person);
    System.out.println("탑승 성공! " + person.getName() + "는 " + seatNo + "번 좌석에 앉았다.");
    
  }
  
  public void getOff(int seatNo) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println("하차 실패! " + seatNo + "번 좌석은 존재하지 않는다.");
      return;
    }
    Person person = seats.get(seatNo - 1).getPerson();
    if(person == null) {
      System.out.println("하차 실패! " + seatNo + "번 좌석은 빈 좌석이다.");
      return;
    }
    System.out.println("하차 성공! " + person.getName() + "는 " + seatNo + "번 좌석에서 일어났다."); 
    seats.set(seatNo - 1, new Seat());
  }
  
  public void info() {
    for(int i = 0, length = seats.size(); i < length; i++) {
      Person person = seats.get(i).getPerson();
      String name = person == null ? "공석" : person.getName();
      System.out.println((i + 1) + "번 좌석: " + name);
    } 
  } 
  
}