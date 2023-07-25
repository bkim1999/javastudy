package ex06_Member;

public class Address {
  
  private String postCode, roadAddr, jibunAddr, detailAddress;
  
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }
  
  public void setRoadAddr(String roadAddr) {
    this.roadAddr = roadAddr;
  }
  
  public void setJibunAddr(String jibunAddr) {
    this.jibunAddr = jibunAddr;
  }
  
  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }
  
  public String getPostCode() {
    return this.postCode;
  }
  
  public String getRoadAddr() {
    return this.roadAddr;
  }
  
  public String getJibunAddr() {
    return this.jibunAddr;
  }
  
  public String getDetailAddress() {
    return this.detailAddress;
  }
  
  public String toString() {
    return "\n도로명주소: " + getRoadAddr()
         + "\n지번주소: " + getJibunAddr()
         + "\n상세주소: " + getDetailAddress()
         + "\n우편번호: " + getPostCode();
  }
}
