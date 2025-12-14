import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (amount >= 5000){
            amount -= amount * 0.15;
        }
        else if (amount >= 3000){
            amount -= amount * 0.10;
    }
        System.out.println("Final Amount = " + amount);
    }
}