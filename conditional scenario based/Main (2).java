import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();
        if (age >= 60)
            System.out.println("Eligible for Senior Citizen Benefits");
        else
            System.out.println("Not Eligible");
    }
}