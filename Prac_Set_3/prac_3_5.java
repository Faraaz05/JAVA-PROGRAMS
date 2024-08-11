import java.text.DecimalFormat;
class Area {
    private double length;
    private double breadth;
    private double area;
    Area(double length , double breadth) {
        this.length = length;
        this.breadth = breadth;
        calculateArea();
    }
    private void calculateArea() {
        this.area = this.length * this.breadth;
    }
    public String returnArea() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(this.area);
    }
}
public class prac_3_5 {
    public static void main(String[] args) {
        Area a1 = new Area(5.4,8.8);
        System.out.println("Area Of Rectangle: " + a1.returnArea());

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }
}
