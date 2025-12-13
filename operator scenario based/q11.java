import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a / 500);
        a %= 500;
        System.out.println(a / 200);
        a %= 200;
        System.out.println(a / 100);
}
}