package ex01_branch;

public class MainWrapper {
  
  public static void ex01() {
    int score = 80;
    if (score >= 60) {
      System.out.println("good");
    }
    if (score < 60) {
      System.out.println("bad");
    }
  }
  
  public static void ex02() {
    int score = 100;
    if (score > 100 || score < 0) {
      System.out.println("잘못된 점수");
    }
    else if (score >= 60)
      System.out.println("합격");
    else if (score < 60)
      System.out.println("불합격");
  }
  
  public static void ex03() {
    int score = 100;
    if (score > 100 || score < 0) {
      System.out.println("잘못된 점수");
    }
    else if (score >= 60)
      System.out.println("합격");
    else
      System.out.println("불합격");
  }
  
  public static void ex04() {
    // swith의 결과는 String, char, int만 가능
    int score = 4;
    switch(score) {
    case 1:
      System.out.println("최악");
      break;
    case 2:
      System.out.println("별로");
      break;
    case 3:
      System.out.println("보통");
      break;
    case 4:
      System.out.println("괜찮");
      break;
    case 5:
      System.out.println("최고");
      break;
    default:
      System.out.println("???");
    }

  }
  
  public static void main(String[] args) {
  
    ex04();

  }

}
