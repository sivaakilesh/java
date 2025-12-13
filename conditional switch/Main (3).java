import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int season=sc.nextInt();
        switch(season){
            case 1:
            case 2:
            case 12:System.out.println("winter");break;
            case 3:
            case 4:
            case 5:System.out.println("summer");break;
            case 6:
            case 7:
            case 8:System.out.println("spring");break;
            case 9:
            case 10:
            case 11:System.out.println("rainy");break;
            default:System.out.println("invalid");
        }
    }
}