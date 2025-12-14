import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int liters = sc.nextInt();
        double bill = 0;
        if (liters <= 1000){
            System.out.println(bill = 0);
        }
        else if (liters <= 3000){
            System.out.println(bill = ((liters - 1000) / 1000.0) * 5);
        }
        else{
            System.out.println(bill = (2 * 5) + ((liters - 3000) / 1000.0) * 10);
        }
        System.out.println(bill);
    }
}