import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 100){
            System.out.println(bill = 0);
        }
        else if (units <= 300){
            System.out.println(bill = (units - 100) * 5);
        }
        else{
            System.out.println(bill = (200 * 5) + (units - 300) * 10);
        }
        if (units > 500){
           System.out.println(bill += bill * 0.10);
        }
        System.out.println(bill);
    }
}