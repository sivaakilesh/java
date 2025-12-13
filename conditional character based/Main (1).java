import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case Letter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lower case Letter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Numbers");
        }
        else{
            System.out.println("Symbols");
        }
    }
}