public class prac_2_5 {
    public static String reverseword(String s) {
        String ans = "";
        for(int i = s.length() - 1; i >= 0 ; i--) {
            ans = ans + s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = " To be Or not To become ";
        int i = 0;
        int j = 0;
        while(j < str.length()) {
            while(str.charAt(j) != ' ') {
                j++;
            }
            System.out.print(reverseword(str.substring(i,j)));
            i = j++; 
        }
        System.out.println("\n23CS012-Faraaz Bhojawala");
    }
}
