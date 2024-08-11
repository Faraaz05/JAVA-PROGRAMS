class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class prac_3_7_b {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println("Before modify: x = " + p.x + ", y = " + p.y);
        modifyPoint(p);
        System.out.println("After modify: x = " + p.x + ", y = " + p.y);

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }

    public static void modifyPoint(Point p) {
        p.x = 10;
        p.y = 20;
    }
}

