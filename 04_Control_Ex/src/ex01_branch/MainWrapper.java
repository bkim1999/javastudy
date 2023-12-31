package ex01_branch;

public class MainWrapper {
  
  public static void ex01() {
    //점수에 따른 학점(if문)
    int score = 100;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    
    if (score >= 90) {
      grade = 'A';
    }
    else if (score >= 80) {
      grade = 'B';
    }
    else if (score >= 70) {
      grade = 'C';
    }
    else if (score >= 60) {
      grade = 'D';
    }
    else {
      grade = 'F';
    }
    System.out.println("ex01 : " + grade);
  }
  
  public static void ex02() {
    //점수에 따른 학점(switch문)
    int score = 100;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    
    switch(score / 10) {
    case 10:
    case 9:
      grade = 'A';
      break;
    case 8:
      grade = 'B';
      break;
    case 7:
      grade = 'C';
      break;
    case 6:
      grade = 'D';
      break;
    default:
      grade = 'F';
    }
    System.out.println("ex02 : " + grade);
  }
  
  public static void ex03() {
    //점수와 학년에 따른 학점
    //1~3학년 : 60점 이상 합격, 아니면 불합격
    //4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 100; // 점수
    int scYear = 1;  // 학년
    String pass;  // "합격", "불합격"
    
//    if (score < 60) {
//      pass = "불합격";
//    }
//    else if (score >= 70) {
//      pass = "합격";
//    }
//    else if (scYear >= 4) {
//      pass = "불합격";
//    }
//    
    
    if (scYear >= 1 && scYear <= 3) {
      if (score >= 60) {  pass = "합격"; }
      else { pass = "불합격"; }
    }
    else {
      if (score >= 70) {  pass = "합격"; }
      else { pass = "불합격"; }
    }
    System.out.println(pass);
  }
  
  public static void ex03_02() {
    //점수와 학년에 따른 학점
    //1~3학년 : 60점 이상 합격, 아니면 불합격
    //4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 100; // 점수
    int scYear = 1;  // 학년
    String pass;  // "합격", "불합격"
    int passScore = 0;
    if (scYear >= 1 && scYear <= 3) {
      passScore = 60;
    }
    else if (scYear >= 4 && scYear <= 6) {
      passScore = 70;
    }
    
    if (score >= passScore) {
      pass = "합격";
    }
    else {
      pass = "불합격";
    }
    System.out.println("ex03 : " + pass);
  }
  
  public static void ex04() {
    //메뉴에 따른 가격
    //아메리카노 : 2000
    //카페라떼 : 2500
    //밀크티 : 3000
    //기타 : 5000
    String order = "아메리카노";
    int price;
    
    switch(order) {
    case "아메리카노":
      price = 2000;
      break;
    case "카페라떼":
      price = 2500;
    case "밀크티":
      price = 3000;
    default:
      price = 5000;
    }
    
    System.out.println("ex04 : " + price + "원");
  }
  
  public static void ex05(){
    //월에 따른 계절
    //3 ~ 5 : 봄
    //6 ~ 8 : 여름
    //9 ~ 11: 가을
    //12 ~ 2: 겨울
    int month = 7;
    String season;  // "봄", "여름", "가을", "겨울"
    
//    if (month >= 3 && month <= 5) {
//      season = "봄";
//    }
//    else if (month >= 6 && month <= 8) {
//      season = "여름";
//    }
//    else if (month >= 9 && month <= 11) {   
//      season = "가을";
//    }
//    else if (month >= 12 && month <= 2) {
//      season = "겨울";
//    }
    
//    int mod = month % 12;
// 
//    if (mod <= 2 ) {
//      season = "겨울";
//    }
//    else if (mod <= 5) {
//      season = "봄";
//    }
//    else if (mod <= 8) {   
//      season = "여름";
//    }
//    else if (mod <= 11) {
//      season = "가을";
//    }
//    
    int seasonCode = ((month + 3) % 12 - 1) / 3 + 1;
    
    switch(seasonCode) {
    case 1:
      season = "겨울";
      break;
    case 2:
      season = "봄";
      break;
    case 3:
      season = "여름";
      break;
    case 4:
      season = "가을";
      break;
    default:
      season = "뭐임";
    }
    
    System.out.println("ex05 : " + season);
  }
  
  public static void ex06() {
    //월에 따른 분기
    //1 ~ 3 : 1분기
    //4 ~ 6 : 2분기
    //7 ~ 9 : 3분기
    //10 ~ 12 : 4분기
    int m = 12;
    int b = (m - 1) / 3 + 1;
    System.out.println("ex06 : " + b + "분기");
    
  }
  
  public static void ex07() {
    //10일 후 요일은?
    int day = 13;  // 13일은 목요일
    int nDay = 10;  // 10일
    String weekname;  // "월", "화", "수", "목", "금", "토", "일"
    
//    String[] weekdays= {"월", "화", "수", "목", "금", "토", "일"};
//    int dayIdx = 3;
//    weekname = weekdays[(dayIdx + nDay) % 7];
    
    switch((day += nDay) % 7) {
    case 0: weekname = "목"; break;
    case 1: weekname = "금"; break;
    case 2: weekname = "토"; break;
    case 3: weekname = "일"; break;
    case 4: weekname = "월"; break;
    case 5: weekname = "화"; break;
    default: weekname = "수";
    }

    
    System.out.println("ex07 : " + weekname);
  }
  
  public static void ex08() {
    // 대소문자 변환 (구글링으로 아스키코드 검색 후 참고)
    char ch = 'S';  // 임의의 대문자 또는 소문자
    
    if (ch >= 'A' && ch <= 'Z') {
      ch += 32;
    }
    else if (ch >= 'a' && ch <= 'z') {
      ch -= 32;
    }

    System.out.println("ex08 : " + ch);
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    ex06();
    ex07();
    ex08();
  }

}