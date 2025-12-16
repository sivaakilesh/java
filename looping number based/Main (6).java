import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0){
            if(a%7==0){
            System.out.println("Amstrong number");
            }
            else{
            System.out.println("not Amstrong number");
            }
        return ;
        }
    }
}