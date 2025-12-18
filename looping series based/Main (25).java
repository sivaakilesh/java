import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("Numbers between 1 and " + N + " that are powers of 2:");

        int power = 1;
        while (power <= N) {
            System.out.print(power + " ");
            power *= 2; 
        }

    }
}
