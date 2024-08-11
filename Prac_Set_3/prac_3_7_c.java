public class prac_3_7_c {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = findMax(a, b);
        System.out.println("Maximum value is: " + max);

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }

    public static int findMax(int x, int y) {
        if(x > y) {
            return x;
        }
        else {
            return y;
        }
    }
}

