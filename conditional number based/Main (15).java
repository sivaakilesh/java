import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0 && a%5==0 && a%8!=0){
            System.out.println("Divsible");
        }
//        else if(a%7==0){
//            System.out.println("Divisible by 7");
//        }
        else{
            System.out.println("Not divisible");
        }
    }
}