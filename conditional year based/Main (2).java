import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a%100==0){
	        System.out.println("century year ");
	    }
	   // else if ( a%400==0){
	   //     System.out.println("leap year");
	   // }
	    else{
		    System.out.println("not ");
	    }
	}
}
