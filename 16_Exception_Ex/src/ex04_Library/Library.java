package ex04_Library;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Library {
  
  private List<Book> books;
  private Scanner sc;
  
  public Library() {
    books = new ArrayList<Book>();
    sc = new Scanner(System.in);
  }
  
  private void addBook() throws InputMismatchException {
    System.out.println("=== 등록 ===");
    System.out.println("책 제목 입력: ");
    String title = sc.nextLine();
    System.out.println("책 가격 입력: ");
    int price = sc.nextInt();
    sc.nextLine();
    books.add(new Book(title, price));
    System.out.println("책 등록됨.");
  }
  
  private void deleteBook() throws RuntimeException {
    System.out.println("=== 삭제 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("삭제할 책이 없음.");
    }
    System.out.println("삭제할 책 제목 입력: ");
    String title = sc.nextLine();
    if(title.isEmpty()) {
      throw new RuntimeException("제목이 입력되지 않음.");
    }
    for(Book book : books) {
      if(title.equals(book.getTitle())) {
        books.remove(book);
        System.out.println("책 삭제됨");
        return;
      }
    }
    System.out.println("등록되지 않은 책.");
  }
  
  private void modifyBook() throws RuntimeException, InputMismatchException {
    System.out.println("=== 수정 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("수정할 책이 없음.");
    }
    System.out.println("수정할 책 제목 입력: ");
    String title = sc.nextLine();
    if(title.isEmpty()) {
      throw new RuntimeException("제목이 입력되지 않음.");
    }
    for(Book book : books) {
      if(title.equals(book.getTitle())) {
        
        System.out.println("새로운 책 제목 입력: ");
        title = sc.nextLine();
        System.out.println("새로운 책 가격 입력: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println(book + " -> \n" + new Book(title, price));
        book.setTitle(title);
        book.setPrice(price);        
        return;
      }
    }
    System.out.println("등록되지 않은 책.");
  }

  private void queryBook() throws RuntimeException {
    System.out.println("=== 조회 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("조회할 책이 없음.");
    }
    System.out.println("조회할 책 제목 입력: ");
    String title = sc.nextLine();
    if(title.isEmpty()) {
      throw new RuntimeException("제목이 입력되지 않음.");
    }
    for(Book book : books) {
      if(title.equals(book.getTitle())) {
        System.out.println(book);
        return;
      }
    }
    System.out.println("등록되지 않은 책.");
  }
  
  private void queryAllBook() throws RuntimeException {
    System.out.println("=== 전체조회 ===");
    int size = books.size();
    System.out.println("전체 보유 도서: " + size + "권");
    if(books.isEmpty()) {
      throw new RuntimeException("조회할 책이 없음.");
    }
    for(int i = 0; i < size; i++) {
      System.out.println((i + 1) + ". " + books.get(i));
    }
  }
  
  public void manage() {
    
    while(true) {
      try {
        System.out.println("1. 등록  2. 삭제  3. 수정  4. 조회  5. 전체조회  0. 종료");
        String choice = sc.nextLine();
        switch(choice) {
        case "1": addBook(); break;
        case "2": deleteBook(); break;
        case "3": modifyBook(); break;
        case "4": queryBook(); break;
        case "5": queryAllBook(); break;
        case "0": System.out.println("도서관리프로그램을 종료함."); return;
        default: System.out.println("잘못된 입력임. 다시 시도.");
        }
      } catch(Exception e) {
        System.out.println(e.getMessage());
      }
      
    }
  }
}
