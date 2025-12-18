import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many positive numbers (N): ");
        int N = sc.nextInt();

        int count = 0;
        int sum = 0;

        while (count < N) {
            System.out.print("Enter a positive number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Negative number skipped. Try again.");
                continue;   
            }

            sum += num;
            count++;    
        }

        System.out.println("Sum of " + N + " positive numbers = " + sum);
        
    }
}
