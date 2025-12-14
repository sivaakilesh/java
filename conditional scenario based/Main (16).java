import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String day = sc.next();
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend Price");
        }
        else{
            System.out.println("Weekday Price");
        }
    }
}