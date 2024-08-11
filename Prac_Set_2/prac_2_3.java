import java.util.*; 
public class prac_2_3 {
    public static void main(String[] args) {
        int[] array = {1,2,9,7,9,8,6,4};
        String str = Arrays.toString(array);
        System.out.println(str);
        String str2 = str.substring(0,11);
        System.out.println(str2.contains("9"));
        System.out.println("\n23CS012-Faraaz Bhojawala");
    }
}