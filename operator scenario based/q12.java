import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a / 5) * 2;
        int d = a - c;
        System.out.println(d * b);
        }
}