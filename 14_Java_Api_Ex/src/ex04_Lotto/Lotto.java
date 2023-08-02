package ex04_Lotto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto {
  
  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
   * @return money 사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0 로또 구매 실패 시 반환
   */
  public int buyLotto() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> ");
    int money = sc.nextInt();
    if(money < 1000 || money > 100000) {
      System.out.println(money + "원 Lotto 구입은 불가능합니다.");
      return 0;
    }
    return money / 1000 * 1000;
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를 생성하는 메소드<br>
   * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
   * @param money 로또 구매 비용
   */
  public void generateLotto(int money) {
    int counter = money / 1000;
    for(int i = 0; i < counter; i++) {
      StringBuilder sb = new StringBuilder("0" + (i + 1) + " : ");
      for(int m = 0; m < 6; m++) {
        sb.append(String.format("%4d", (int)(Math.random() * 45 + 1)));
      }
      System.out.println(sb.toString());
      if((i + 1) % 5 == 0) {
        System.out.println("------------------------------");
      }
    }
  }
}