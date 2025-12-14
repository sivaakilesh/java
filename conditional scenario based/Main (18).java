import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int usage = sc.nextInt();
        if (usage < 50){
            System.out.println("Low Data");
        }
        else if (usage <= 100){
            System.out.println("Half Consumed");
        }
        else{
            System.out.println("Data Over");
        }
    }
}