import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int last=n%10;
        int first=0;
        int p=1;
        while(temp>=10) {
            p=p*10;
            temp=temp/10;
        }
        first=temp;
        int middle=(n%p)/10;
        int result=(last*p)+(middle*10)+first;
        System.out.println(result);
    }
}