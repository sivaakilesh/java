import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();
        double discount;
        if (bill >= 5000){
            discount = bill * 20;
        }
        else if (bill >= 2000){
            discount = bill * 10;
        }
        else{
            discount = bill * 5;
        }
        System.out.println(discount);
        System.out.println(bill - discount);
    }
}