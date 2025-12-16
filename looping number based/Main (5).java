import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0;
        int org=a;
        while(a!=0){
        int b=a%10;
        rev=rev*10+b;
        a/=10;
        }
        System.out.println(rev);
        if(org==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}