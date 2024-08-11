import java.util.Scanner;
public class prac_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number To Reverse: ");
        int num = scan.nextInt();
        int digit;
        while(num != 0) {
            digit = num%10; 
            System.out.print(digit);
            num = num/10;
        }
        System.out.println("\n23CS012-Faraaz Bhojawala");
    }
}