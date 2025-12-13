import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Alphabet letter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Alphabet letter");
        }
        else{
            System.out.println("not Alphabet letter");
        }
    }
}