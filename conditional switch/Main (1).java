import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 10:System.out.println("A");break;
            case 9:System.out.println("B");break;
            case 8:System.out.println("C");break;
            default:System.out.println("Fail");
        }
    }
}