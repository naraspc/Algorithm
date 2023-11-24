import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
  BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

       while (true) {
           int n = Integer.parseInt(sc.readLine());
           if (n == 0) break;
           boolean[] prime = new boolean[2*n+1];

           int cnt = 0;
           Arrays.fill(prime, true);

           prime[0] = false;
           prime[1] = false;


           for (int i = 2; i <Math.sqrt(prime.length); i++) {
               if (!prime[i]) continue;
               for (int j = i * 2; j < prime.length; j += i) {
                   prime[j] = false;
               }

           }

           for (int i = n + 1; i <= 2 * n; i++) {
               if (prime[i]) cnt++;
           }
           System.out.println(cnt);
       }
    }

}
