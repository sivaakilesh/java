import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        int count = 0;
        int num = 2;

        while (count < N) {
            int a = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    a++;
                }
            }

            if (a==2) { 
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

    }
}
