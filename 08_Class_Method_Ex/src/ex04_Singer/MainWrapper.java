package ex04_Singer;

public class MainWrapper {

  public static void main(String[] args) {
    
    Song song = new Song();
    
    song.setTitle("Ditto");
    song.setGenre("K-Pop");
    song.setPlayTime(3.2);
    
    song.info();
    
    Singer singer = new Singer();
    
    singer.setName("NewJeans");
    singer.setTitleSong(song);
    
    singer.info();
  }

}
