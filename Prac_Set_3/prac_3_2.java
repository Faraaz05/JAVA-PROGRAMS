public class prac_3_2 {
    private String shape;
    private double radius;
    private double length;
    private double base;

    public prac_3_2() {
        this.shape = "undefined";
    }

    public prac_3_2(double radius) {
        this.shape = "circle";
        this.radius = radius;
    }

    public prac_3_2(double length, double base) {
        this.shape = "triangle";
        this.length = length;
        this.base = base;
    }

    // Method to calculate prac_3_2
    public double calculateprac_3_2() {
        switch (shape) {
            case "circle":
                return Math.PI * radius * radius;
            case "triangle":
                return 0.5 * length * base;
            default:
                return 0.0;
        }
    }

    public String getShape() {
        return shape;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    public double getBase() {
        return base;
    }

    public static void main(String[] args) {
        prac_3_2 undefinedprac_3_2 = new prac_3_2();
        prac_3_2 circleprac_3_2 = new prac_3_2(5.0);
        prac_3_2 triangleprac_3_2 = new prac_3_2(4.0, 6.0);

        System.out.println("Undefined prac_3_2 shape: " + undefinedprac_3_2.getShape());
        System.out.println("Circle prac_3_2: " + circleprac_3_2.calculateprac_3_2());
        System.out.println("Triangle prac_3_2: " + triangleprac_3_2.calculateprac_3_2());

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }
}
