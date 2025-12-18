import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        while(n>0){
            int d=n%10;
            if(d%2==0)
                even=1;
            else
                odd=1;
            n=n/10;
        }
        if(even==1 && odd==1)
            System.out.println("Mixed");
        else if(even==1)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}