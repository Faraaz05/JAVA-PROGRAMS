public class prac_3_7_a {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside swap: x = " + x + ", y = " + y);
    }
}

