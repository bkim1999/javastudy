package controller;

import java.util.List;
import java.util.Map;

import dto.ContactDto;
import service.ContactService;
import service.ContactServiceImpl;

public class ContactController {
  
  private ContactService contactService = new ContactServiceImpl();
  
  /**
   * 요청 처리 메소드<br>
   * @param choice 1, 2, 3, 4, 5 중 하나
   * @param map 사용자가 입력한 값
   *            choice == 1 : name, tel, email, address
   *            choice == 2 : contact_no, name, tel, email, address
   *            choice == 3 : contact_no
   *            choice == 4 : null
   *            choice == 5 : contact_no
   * @return message 처리 결과 메세지
   */
  public String request(String choice, Map<String, Object> map) {
    
    System.out.println("Controller::" + map);
    
    String message = "";
    
    // 1. 삽입 2. 수정 3. 삭제 4. 전체조회 5. 상세조회 0. 종료
    switch(choice) {
    case "1":
      int insertCount = contactService.insert(map);
      message = insertCount + "개 연락처가 등록되었다.";
      break;
      case "2":
      int updateCount = contactService.update(map);
      message = updateCount + "개 연락처가 수정되었다.";
      break;
      case "3":
      int deleteCount = contactService.delete(map);
      message = deleteCount + "개 연락처가 삭제되었다.";
      break;
      case "4":
      List<ContactDto> list = contactService.selectList();
      if(list.isEmpty()) {
        message = "조회할 연락처가 없다.";
        break;
      }
      StringBuilder sb = new StringBuilder();
      sb.append("---------------------------------------------------\n");
      for(ContactDto contactDto : list) {
        sb.append(contactDto).append("\n---------------------------------------------------\n");
      }
      message = sb.toString();
      break;
      case "5":
      ContactDto contactDto = contactService.selectContactByNo(map);
      if(contactDto == null) {
        message = "없는 연락처다.";
        break;
      }
      message = contactDto.toString();
      break;
    }
    
    return message;
    
  }
}
