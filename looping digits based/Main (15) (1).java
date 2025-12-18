import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
        String[] words={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int rev=0;
        while (n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        while(rev>0){
            int d=rev%10;
            System.out.print(words[d]+" ");
            rev=rev/10;
        }
	}
}
