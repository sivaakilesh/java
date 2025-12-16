import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            int f=1;
            for(int i=1;i<=d;i++)
                f*=i;
            sum+=f;
            n/=10;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }
}