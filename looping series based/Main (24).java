import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        for (int num = 1; num <= N; num++) {
            int sum = num;
            while (sum > 9) {
                int a = sum;
                sum = 0;
                while (a> 0) {
                    int digit = a % 10;
                    sum += digit * digit;
                    a /= 10;
                }
            }
            if (sum == 1) {
                System.out.print(num + " ");
            }
        }

    }
}
