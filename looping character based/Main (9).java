import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String c=Integer.toBinaryString(a);
        System.out.println("Decimal number :"+a);
        System.out.println("Binary number :"+c);
    }
}