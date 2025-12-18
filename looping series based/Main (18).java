import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                int d = num % 10;
                sum = sum + d * d * d;
                num = num / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

    }
}
