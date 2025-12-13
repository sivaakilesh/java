import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("Equilateral triangle");
        }
        else if(a==b && c!=a){
            System.out.println("isoceles triangle");
            }
            else{
                System.out.println("scalene triangle");
            }
    }
}
