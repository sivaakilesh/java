import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();
        for(int num=1;num<=N;num++){
            int sum=0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                sum+=i;
            }
            }
            if(sum==num){
                System.out.println(num);
            }
        }
        
}
}

        