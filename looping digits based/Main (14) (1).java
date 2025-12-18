import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
        int sumSquare=0;
        int sumCube=0;
        while(n>0){
            int d=n%10;
            sumSquare=sumSquare+(d*d);
            sumCube=sumCube+(d*d*d);
            n=n/10;
        }
        System.out.println("Sum of squares = " + sumSquare);
        System.out.println("Sum of cubes = " + sumCube);
        }
	}
}

