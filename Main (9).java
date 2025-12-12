 import java.util.Scanner;
   public class Main{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
      int first=a/100;
      int last =a%10;
      int sum=first+last;
       System.out.println(sum);
     }
   }
