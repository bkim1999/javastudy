package ex03_advanced_for;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start_index = 0;
        int end_index = 0;
        int sum = 1;
        int count = 1;
        
        while(end_index < N) {
            if(sum < N) {
                end_index++;
                sum += end_index;
            }
            else if(sum > N) {
                sum -= start_index;
                start_index++;
            }
            else if(sum == N) {
                end_index++;
                sum += end_index;
                count++;
            }
        }
        
        System.out.println(count);
    }
}