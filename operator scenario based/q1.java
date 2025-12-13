
import java.util.*;


public class Main {
    
   public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double finalPrice = a - (a * b / 100);
       System.out.println( finalPrice);
     }
}