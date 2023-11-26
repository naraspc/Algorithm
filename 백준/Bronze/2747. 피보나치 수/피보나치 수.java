import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(sc.readLine());
        if (num <2) {
            System.out.println(num);
        } else {
            int[] dp = new int[num + 1];
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i < dp.length; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            System.out.println(dp[num]);
        }
    }
}
