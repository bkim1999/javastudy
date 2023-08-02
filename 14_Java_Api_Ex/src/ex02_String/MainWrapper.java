package ex02_String;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class MainWrapper {

  // 문제1. 다음 주소를 아래와 같이 분석하여 분리하시오.
  // String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
  // String requestURI = "https://comic.naver.com/webtoon/detail";  // 물음표(?) 이전 문자열만 추출
  // String param = "titleId=758037&no=112&weekday=mon";            // 물음표(?) 이후 문자열만 추출
  public static void ex01() {
    String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
    String requestURI = "";
    String param = "";
    
    String[] splits = url.split("[?]");
    requestURI = splits[0];
    param = splits[1];
    
    System.out.println("String url = " + url);
    System.out.println("String requestURI = " + requestURI);
    System.out.println("String param = " + param);
  }

  // 문제2. 다음 파일명을 분석하여 파일명과 확장자를 분리하시오.
  // String fullName = "apple.jpg";
  // String fileName = "apple";
  // String extName = "jpg";
  public static void ex02() {
    String fullName = "apple.jpg";
    String fileName = "";
    String extName = "";
    
    String[] splits = fullName.split("[.]");
    fileName = splits[0];
    extName = splits[1];
    
    System.out.println("String fullName = " + fullName);
    System.out.println("String fileName = " + fileName);
    System.out.println("String extName = " + extName);
  }

  // 문제3. 다음 기준에 따라서 파일명을 변환하시오.
  // 사용자로부터 공백이 포함되어 있지 않은 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
  // 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
  // 실행예시)
  // 변환 전 파일명 >>> happy.jpg
  // 변환 후 파일명 = happy_1658792128410.jpg
  public static void ex03() {
    String beforeName = "";  // 변환 전 파일명
    String afterName = "";   // 변환 후 파일명
    
    Scanner sc = new Scanner(System.in);
    System.out.print("변환 전 파일명 >>> ");
    beforeName = sc.next();
    String[] splits = beforeName.split("[.]");
    afterName += splits[0] + "_" + System.currentTimeMillis() + "." + splits[1];
    System.out.println("변환 후 파일명 >>> " + afterName);
  }
  
  // 문제4. 주어진 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
  // 나이 : 현재년도 - 태어난년도 (생일이 지났는지 여부는 따지지 않습니다.)
  // 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
  // 실행예시)
  // 9살 남자입니다.
  public static void ex04() {
    String personalId = "141212-3345678";
    
    int birthYear = Integer.parseInt(personalId.substring(0, 2)) + 2000;
    LocalDate date = LocalDate.now();
    int currentYear = date.getYear();
    int age = currentYear - birthYear;
    int sexNum = Integer.parseInt(personalId.substring(7, 8));
    String sex = sexNum % 2 != 0 ? "남자" : "여자";
    
    System.out.println(age + "살 " + sex + "입니다.");
  }
  
  // 문제5. 사용자로부터 입력 받은 문자열을 거꾸로 읽어도 원래 문자열과 동일한지 여부를 파악하는 프로그램을 구현하시오.
  // 실행예시1)
  //   문자열 입력 >>> 메롱
  //   메롱 : 거꾸로 읽으면 메롱과 다릅니다.
  // 실행예시2)
  //   문자열 입력 >>> 역삼역
  //   역삼역 : 거꾸로 읽어도 역삼역입니다.
  public static void ex05() {
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 입력 >>> ");
    String str = sc.next();
    boolean flag = true;
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
        flag = false;
      }
    }
    
    if(flag) {
      System.out.println(str + " : 거꾸로 읽어도 " + str + "입니다.");
    } else {
      System.out.println(str + " : 거꾸로 읽으면 " + str + "과 다릅니다.");
    }
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
  }

}