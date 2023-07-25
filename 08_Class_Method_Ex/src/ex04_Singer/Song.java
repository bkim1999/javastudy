package ex04_Singer;

public class Song {

  private String title, genre;
  private double playTime;
  
  public void setTitle(String title) {
    this.title = title;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public void setPlayTime(double playTime) {
    this.playTime = playTime;
  }
  
  public void info() {
    System.out.println("제목: " + title);
    System.out.println("장르: " + genre);
    System.out.println("재생시간: " + playTime + "분");
  }
  
}
