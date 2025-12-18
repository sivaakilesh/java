import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev=10;
        while(n>0){
            int d=n%10;
            if(d>prev){
                System.out.println("Not Ascending");
                return;
            }
            prev=d;
            n=n/10;
        }
        System.out.println("Ascending");
    }
}