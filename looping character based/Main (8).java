import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = sc.next(); 
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            char c = binaryNumber.charAt(i);
            if (c == '1') {
                count1++;
            } else if (c == '0') {
                count0++;
            } else {
                System.out.println("Invalid character in input: " + c);
                return; 
            }
        }

        System.out.println("Number of 1s: " + count1);
        System.out.println("Number of 0s: " + count0);
    }
}
