import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        int c=Integer.parseInt(a,2);
        System.out.println("binary number :"+a);
        System.out.println("decimal number :"+c);
    }
}