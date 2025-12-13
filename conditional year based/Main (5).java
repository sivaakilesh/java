import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        int month = sc.nextInt();

        int days = 0;
        boolean valid=true;
        if (year<=0) {
            valid=false;
        }
        else if (month<1||month>12) {
                valid=false;
        }
        else { 
            if (month == 1||month==3||month==5||month==7||month==8||month==10||month==12) {
                days=31;
            }
            else if (month==4||month==6||month==9||month==11) {
                days=30;
            }
            else { 
                if ((year%400==0)||(year%4==0 && year%100!=0)) {
                    days=29;
                } else {
                    days=28;
                }
            }
        }

        if (valid) {
            System.out.println("Valid year and month.");
            System.out.println( days);
        } else {
            System.out.println("Invalid year or month.");
        }
    }
}
