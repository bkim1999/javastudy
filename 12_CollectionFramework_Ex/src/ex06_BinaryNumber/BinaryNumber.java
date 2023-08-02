package ex06_BinaryNumber;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {
  
  @SuppressWarnings("unused")
  private int number;
  private List<Integer> binary;
  
  public BinaryNumber(int number) {
    this.number = number;
    binary = new ArrayList<Integer>();
    if(number == 0) {
      binary.add(0);
    }
    while(number > 0) {
      binary.add(number % 2);
      number /= 2;
    }
  }
  
  public String toString() {
    String ret = "";
    for(int i = 0; i < binary.size(); i++) {
      ret = binary.get(i) + ret;
    }
    return ret;
  }
 
}
