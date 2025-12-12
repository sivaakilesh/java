import java.util.Scanner;
class formulabase15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        
        double surfaceArea = 2 * 3.14159 * r * (h + r);
        double volume = 3.14159 * r * r * h;
        
        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
