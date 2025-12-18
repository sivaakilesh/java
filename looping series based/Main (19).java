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
                int digit = num % 10;
                int fact = 1;

                for (int j = 1; j <= digit; j++) {
                    fact = fact * j;
                }

                sum = sum + fact;
                num = num / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

    }
}
