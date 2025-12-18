import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int number=sc.nextInt();
        int digit=sc.nextInt();
        int temp=number;
        while(temp>0) {
            if(temp%10==digit){
                System.out.println("Digit found");
                return;
            }
            temp=temp/10;
        }
        System.out.println("Digit not found");
    }
}