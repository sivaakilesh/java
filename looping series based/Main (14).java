import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        while (true) {
             System.out.print("Enter a number : ");
            num = sc.nextInt();

            if (num < 0) {
                break;
            }

            sum += num;
        }
    
        System.out.println("Sum of positive numbers: " + sum);
    }
}
