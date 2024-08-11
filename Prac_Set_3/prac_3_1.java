import java.util.*;
public class prac_3_1 {
    public static void main(String[] args) {
        double conversionRate = 100.00;
        double pound;
        if(args.length > 0) {
            try {
                pound = Double.parseDouble(args[0]);
                System.out.println("To Rupees = " + pound*conversionRate);
                return;
            }
            catch(NumberFormatException e) {
                System.out.println("Value Must Be Of Double Type...");
                return;
            }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Pound Value: ");
        pound = scan.nextDouble();
        System.out.println("To Rupees = " + pound*conversionRate);

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }
}
