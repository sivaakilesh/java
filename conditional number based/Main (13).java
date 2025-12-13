import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0){
            if(a%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
    }
}