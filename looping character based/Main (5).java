import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char a=sc.next().charAt(0);
	    char b=sc.next().charAt(0);
	    for(char ch=(char)(a+1);ch<b;ch++){
	        System.out.print(ch+" ");
	    }
	   
	}
}