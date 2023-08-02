package ex04_Library;

import java.util.Objects;

public class Book {
  
  private String title;
  private long price;
  
  public Book() {
    
  }

  public Book(String title) {
    this(title, 0);
  }

  public Book(String title, long price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(price, title);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return price == other.price && Objects.equals(title, other.title);
  }

  @Override
  public String toString() {
    return String.format("%-30s", title) + "  가격: " + price + "원";
  }
  
}
