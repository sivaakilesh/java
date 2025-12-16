import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Not a Power of 3");
            return;
        }
        while(n%3==0)
            n/=3;
        if(n==1){
            System.out.println("Power of 3");
        }
        else{
            System.out.println("Not a Power of 3");
        }
    }
}