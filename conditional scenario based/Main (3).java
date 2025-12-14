import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if (battery <= 20){
            System.out.println("Low Battery");
        }
        else if (battery <= 50){
            System.out.println("50% Consumed");
        }
        else{
            System.out.println("Battery Full");
        }
    }
}