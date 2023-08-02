import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
  public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int[] S = new int[N + 1];
        for(int i = 1; i < S.length; i++){
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        int result = 0;
        int[] C = new int[M];
        for(int i = 1; i < S.length; i++){
            int remainder = S[i] % M;
            if(remainder == 0) {
              result++;
            }
            C[remainder]++;   
        }
        for(int i = 0; i < C.length; i++) {
          if(C[i] > 1) {
            result += (C[i] * (C[i] - 1)) / 2;
          }
        }
        
        System.out.println(result);
        
  } 
}