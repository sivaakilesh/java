import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("N:");
         int n=sc.nextInt();
         for(int i=1;i<=n;i++){
             if(i%7==0||i%10==7){
                System.out.print(i+" ");  
             }
         }
    }
}
    
       