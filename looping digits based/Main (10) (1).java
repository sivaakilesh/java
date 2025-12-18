import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   while(a!=0 && b!=0 && c!=0){
	       if(a<=b && a<=c){
	           System.out.println(a);
	           return;
	       }
	       else if(b<=c){
	           System.out.println(b);
	           return;
	       }
	       else{
	           System.out.println(c);
	           return;
	       }
	   }
	}
}