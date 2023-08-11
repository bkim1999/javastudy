package service;

import java.util.List;
import java.util.Map;

import dao.ContactDao;
import dto.ContactDto;

public class ContactServiceImpl implements ContactService {

  ContactDao contactDao = ContactDao.getDao();
  
  @Override
  public int insert(Map<String, Object> map) {
    
    System.out.println("Service::insert(" + map + ")");
    
    ContactDto contactDto = new ContactDto();
    
    contactDto.setName((String) map.get("name"));
    contactDto.setTel((String) map.get("tel"));
    contactDto.setEmail((String) map.get("email"));
    contactDto.setAddress((String) map.get("address"));
    
    return contactDao.insert(contactDto);
    
  }

  @Override
  public int update(Map<String, Object> map) {
    
    System.out.println("Service::update(" + map + ")");
    
    int contact_no = (int) map.get("contact_no");
    String name = (String) map.get("name");
    String tel = (String) map.get("tel");
    String email = (String) map.get("email");
    String address = (String) map.get("address");
    
    ContactDto originDto = contactDao.selectContactByNo(contact_no);
    if(originDto == null)
      return 0;
    
    ContactDto contactDto = new ContactDto();
    
    contactDto.setContact_no(contact_no);
    contactDto.setName(name.isEmpty() ? originDto.getName() : name);
    contactDto.setTel(tel.isEmpty() ? originDto.getTel() : tel);
    contactDto.setEmail(email.isEmpty() ? originDto.getEmail() : email);
    contactDto.setAddress(address.isEmpty() ? originDto.getAddress() : address);
    
    return contactDao.update(contactDto);
  }

  @Override
  public int delete(Map<String, Object> map) {
    
    System.out.println("Service::delete(" + map + ")");
        
    if(map == null)
      return 0;
    
    int contact_no = (int) map.get("contact_no");
    return contactDao.delete(contact_no);
    
  }

  @Override
  public List<ContactDto> selectList() {
    
    System.out.println("Service::selectList()");
        
    return contactDao.selectList();
    
  }

  @Override
  public ContactDto selectContactByNo(Map<String, Object> map) {

    System.out.println("Service::selectContactByNo(" + map + ")");
    
    int contact_no = (int) map.get("contact_no");
    return contactDao.selectContactByNo(contact_no);
    
  }

}
