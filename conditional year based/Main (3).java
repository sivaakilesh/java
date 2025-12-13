import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=a%100;
	    int c=a/100;
	    if(b==c){
	        System.out.println("same");
	    }
	    else{
	        System.out.println("not same");
	    }
	}
}
