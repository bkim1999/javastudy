package ex02_random;

import java.util.UUID;

public class Ex04_UUID {

  public static void main(String[] args) {

    UUID uuid = UUID.randomUUID();
    String str = uuid.toString();
    System.out.println(str);

  }

}
