import java.util.*;
public class prac_2_6 {
    public static String reverseword(String s) {
        String ans = "";
        for(int i = s.length() - 1; i >= 0 ; i--) {
            ans = ans + s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: "); 
        String str = scan.nextLine();
        boolean begflag = true;
        while (begflag) { 
        System.out.println("\n23CS012-Faraaz Bhojawala");
        System.out.println("Enter A Choice: ");
        System.out.println("1) Find Length:  ");
        System.out.println("2) Turn To lowercase: ");
        System.out.println("3) Turn To UPPERCASE: ");
        System.out.println("4) Reverse String: ");
        System.out.println("5) Sort String: : ");
        System.out.println("6) Exit: ");
        System.out.println("Enter Choice");
        int choice = scan.nextInt();
        switch(choice) {
            case 1: {
                System.out.println("Length Of String Is " + str.length());
                break;
            }
            case 2: {
                System.out.println(str.toLowerCase());
                break;
            }
            case 3: {
                System.out.println(str.toUpperCase());
                break;
            }
            case 4: {
                System.out.println(reverseword(str));
                break;
            }
            case 5: {
                char charArray[] = str.toCharArray();
                Arrays.sort(charArray);
                System.out.println(new String(charArray));
                break;
            }
            case 6: {
                begflag = false;
                System.out.println("EXITING.....");
                System.out.println("\n23CS012-Faraaz Bhojawala");
                break;
            }
        }
    }
}
}
