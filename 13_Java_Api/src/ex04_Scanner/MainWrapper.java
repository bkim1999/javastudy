package ex04_Scanner;

import java.util.Scanner;

public class MainWrapper {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    String next = sc.next();
    String nextLine = sc.nextLine();
    
    System.out.println(a);
    System.out.println(next);
    System.out.println(nextLine);
  }

}