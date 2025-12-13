import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(0<=a && a<=9){
            System.out.println("Given number is single digit");
        }
        else if(10<=a && a<=99){
            System.out.println("Given number is double digit");
        }
        else if(100<=a && a<=999){
            System.out.println("Given number is triple digit");
        }
        else{
            System.out.println("Given number is more than triple digit");
        }
    }
}