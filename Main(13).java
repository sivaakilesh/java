import java.util.Scanner;
class formulabase13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        
        int surfaceArea = 2 * (l*b + b*h + h*l);
        int volume = l * b * h;
        
        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
