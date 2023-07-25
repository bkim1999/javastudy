package ex06_Member;

public class MainWrapper {

  public static void main(String[] args) {

    Address address = new Address();
    address.setPostCode("89900");
    address.setJibunAddr("111번지 223");
    address.setRoadAddr("뉴진스로 11길33");
    address.setDetailAddress("101동 101호");
    
    Contact contact = new Contact();
    contact.setHomeTel("02-000-0000");
    contact.setMobile("010-0000-0000");
    contact.setAddress(address);
    
    Member member = new Member();
    member.setName("김민지");
    member.setContact(contact);
    
    System.out.println(member);
    System.out.println();
    System.out.println("이름: " + member.getName());
    System.out.println("집전화: " + member.getContact().getHomeTel());
    System.out.println("휴대전화: " + member.getContact().getMobile());
    System.out.println("우편번호: " + member.getContact().getAddress().getPostCode());
    System.out.println("도로명주소: "+ member.getContact().getAddress().getRoadAddr());
    System.out.println("지번주소: "+ member.getContact().getAddress().getJibunAddr());
    System.out.println("상세주소: "+ member.getContact().getAddress().getDetailAddress());
  }
}