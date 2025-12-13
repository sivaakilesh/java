import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int balance = 10000000;
        int amount;
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:System.out.println("Balance = ₹" + balance);break;
            case 2:System.out.print("Enter deposit amount: ");
                amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("New Balance = ₹" + balance);break;
            case 3:System.out.print("Enter withdraw amount: ");
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("New Balance = ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                } break;
            default:System.out.println("Invalid Choice");
        }
    }
}
