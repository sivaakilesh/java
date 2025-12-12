import java.util.Scanner;
class formulabase12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int surfaceArea = 6 * a * a;
        int volume = a * a * a;
        int perimeter = 12 * a;
        
        System.out.println(surfaceArea);
        System.out.println(volume);
        System.out.println(perimeter);
    }
}
