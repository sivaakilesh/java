import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age = sc.nextInt();
        if (age < 12){
            System.out.println("Child Ticket");
        }
        else if (age < 60){
            System.out.println("Adult Ticket");
        }
        else{
            System.out.println("Senior Ticket");
        }
    }
}