import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev=-1;
        while(n>0){
            int d=n%10;
            if(prev!=-1 && d<prev){
                System.out.println("Not descending");
                return;
            }
            prev=d;
            n=n/10;
        }
        System.out.println("descending");
    }
}