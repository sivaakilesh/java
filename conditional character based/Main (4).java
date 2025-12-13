import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char ch1=sc.next().charAt(0);
        if(ch==ch1){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}