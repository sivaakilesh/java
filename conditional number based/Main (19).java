import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int a=(int)ch;
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}