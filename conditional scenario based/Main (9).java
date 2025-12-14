import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        if (color.equalsIgnoreCase("Red")){
            System.out.println("Stop");
        }
        else if (color.equalsIgnoreCase("Yellow")){
            System.out.println("Ready");
        }
        else if (color.equalsIgnoreCase("Green")){
            System.out.println("Go");
        }
    }
}