import java.util.Scanner;
class formulabase14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        double a= 4 * 3.14159 * r * r;
        double b = (4.0/3.0) * 3.14159 * r * r * r;
        
        System.out.println(a);
        System.out.println(b);
    }
}
