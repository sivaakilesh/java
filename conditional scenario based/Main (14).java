import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int speed = sc.nextInt();
        if (speed > 100){
            System.out.println("Speed Limit Exceeded");
        }
        else{
            System.out.println("Speed Within Limit");
        }
    }
}