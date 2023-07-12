package ex01_variable;

public class MainWrapper {
  
  public static void main(String[] args) {

    /*
     * 키워드 규칙
     * 1. 프로젝트 : 맘대로
     * 2. 패키지   : 모두 소문자로 작성
     * 3. 클래스   : Upper Camel Case
     * 4. 메소드   : Lower Camel Case
     * 5. 변수     : Lower Camel Case
     * 6. 상수     : Snake Case
     * 
     * 들여쓰기 = 필수
     */
    
    boolean isGood = true;
    boolean isAlive = false;
    
    System.out.println(isGood);
    System.out.println(isAlive);
    
    char ch1 = 'A';
    char ch2 = '가';
    
    System.out.println(ch1);
    System.out.println(ch2);
    
    int score = 100;
    long money = 999999999999999999L;
    
    System.out.println(score);
    System.out.println(money);
    
    double percent = 99.9999999999999;
    System.out.println(percent);
    
    final double PI = 3.141592;
    System.out.println(PI);
    
    String shampoo = "흔들리는 꽃들 속에서\n"
                  + "니 샴푸향이 느껴진거야\n"
                  + "스쳐지나간건가 뒤돌아보지만\n"
                  + "그냥 사람들만 보이는 거야\n"
                  + "다와가는 집근처에서\n"
                  + "그냥 핸드폰만 만지는 거야\n"
                  + "한 번 연락해볼까 용기내보지만\n"
                  + "그냥 내 마음만 바빠진거야\n"
                  + "걷다가보면 항상 이렇게 너를\n"
                  + "바라만보던 너를 기억한다고 말할까\n"
                  + "그냥 이렇게 계속 이렇게 너를\n"
                  + "바라만보던 너를 연락했다 할까";
    
    
    String supershy = "super shy super shy\n"
                    + "wait a minute while i make you mine make you mine\n"
                    + "떨리는 지금에도 you're on mind all the time\n"
                    + "I wanna say but I'm super shy super shy";

    System.out.println(shampoo);
    System.out.println(supershy);    
  }
    
}