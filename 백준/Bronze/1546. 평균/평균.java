import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        double average = 0;

        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            sum = sum + A[i];
        }
        average = (double) (sum * 100) / max / N;
        System.out.println(average);
    }

}