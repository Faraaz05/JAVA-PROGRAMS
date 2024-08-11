public class prac_2_1 {

    public static String front_lines(String s , int n) {
        String ans = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                ans = ans + s.charAt(j);
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Chocolate";
        System.out.println(front_lines(str,6));
        System.out.println("\n23CS012-Faraaz Bhojawala");
    }
}
