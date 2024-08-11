import java.util.*;
public class prac_2_2 {
    public static void main(String[] args) {
        int arr[] = {2,9,3,6,9,9,0};
        String str = Arrays.toString(arr);
        int count = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == '9') {
                count++;
            }
        }
        System.out.println("9 Occures " + count + " Times");
        System.out.println("\n23CS012-Faraaz Bhojawala");
    }
}
