import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int even=0,odd=0;
        while (n>0){
            int d=n%10;
            if (d%2==0)
                even=even+d;
            else
                odd=odd+d;
                n=n/10;
        }
        int a=odd-even;
        System.out.println(a);
	}
}          