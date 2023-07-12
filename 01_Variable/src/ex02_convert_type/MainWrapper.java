package ex02_convert_type;

public class MainWrapper {
  
  public static void main(String[] args) {
    
    /*
     * 자동변환(promotion)
     * 1. 작은 크기 -> 큰 크기
     * 2. 정수 -> 실수
     * 
     * 강제변환(casting)
     * 1. 큰 크기 -> 작은 크기
     * 2. 실수 -> 정수
     * 
     * 구문 분석(parsing)
     * 1. 문자열 -> 정수
     * 2. 문자열 -> 실수
     */
    
    byte num1 = 127;
    int num2 = num1;
    System.out.println(num2);
    
    double addResult = 1.5 + 5;
    System.out.println(addResult);
    
    int num3 = 257;
    byte num4 = (byte) num3;
    System.out.println(num4);
    
    double pct = 0.5;
    int iPct = (int)pct;
    System.out.println(iPct);
    
    String strScore = "100";
    int score = Integer.parseInt(strScore);
    
    String strMoney = "9999999";
    long money = Long.parseLong(strMoney);
    
    String strPct = "0.5";
    double pct1 = Double.parseDouble(strPct);
    
    System.out.println(score);
    System.out.println(money);
    System.out.println(pct1);
  }
}
