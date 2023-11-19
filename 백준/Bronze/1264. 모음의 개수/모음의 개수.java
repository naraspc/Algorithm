import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            int count = 0;
            String a = sc.nextLine().toLowerCase();
            if (a.equals("#")) {
                break;
            }
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'a'||a.charAt(i) == 'e'||a.charAt(i) == 'i'||a.charAt(i) == 'o'||a.charAt(i) == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
