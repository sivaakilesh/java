import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    if(a==b && c==d && b==c && d==a){
	        System.out.println("square");
	    }
	    else if(b==d && c==a){
	        System.out.println("rectangle");
	    }
	    else{
	     System.out.println("sides not form a square or rectangle");   
	    }
	}
	
}