import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int oddsum=0;
    int evensum=0;
    System.out.println("N:"+n);
    for(int i=1;i<=n;i++){
        if(!(i%2==0)){
        oddsum+=i;
    }
    else{
        evensum+=i;
    }
    }
     System.out.println("odd sum :"+oddsum);
      System.out.println("even sum :"+evensum);
}
}