import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a*a+b*b;
        if(d==c*c){
        System.out.println("right angle triangle");
    }
    else{
        System.out.println("not a right angle triangle");
    }
    
    }
}
