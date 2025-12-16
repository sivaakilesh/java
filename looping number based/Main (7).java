import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(a>b)?a:b;
        while(true){
            if(c%a==0 && c%b==0){
            System.out.println(c);
            break;
            }
            c++;
        }
    }
}