import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i*i<=n){
            if(i*i==n){
                System.out.println("Perfect Square");
                return;
            }
            i++;
        }
        System.out.println("Not Perfect Square");
        }
    }