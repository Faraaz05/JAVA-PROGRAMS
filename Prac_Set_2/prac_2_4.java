public class prac_2_4 {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "";
        for(int i = 0; i < str.length(); i++) {
            str2 = str2 + str.charAt(i) + str.charAt(i);
        }
        System.out.print(str2);
        System.out.println("\n23CS012-Faraaz Bhojawala");
    }
}