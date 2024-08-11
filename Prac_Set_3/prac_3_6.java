import java.util.*;
class Complex {
    private double imag;
    private double real;
    Complex() {
        setReal();
        setImag();
    }
    public void setImag() {
        System.out.println("Set Imaginary Value: ");
        Scanner scan = new Scanner(System.in);
        this.imag = scan.nextDouble();
    }
    public void setReal() {
        System.out.println("Set Real Value: ");
        Scanner scan = new Scanner(System.in);
        this.real = scan.nextDouble();
    }
    public void add(Complex c) {
        System.out.print("Addition: ");
        System.out.println
        ("(" + (this.real + c.real) + ") + (" + (this.imag + c.imag) + ")i");
    }
    public void subtract(Complex c) {
        System.out.print("Subtraction: ");
        System.out.println
        ("(" + (this.real - c.real) + ") + (" + (this.imag - c.imag) + ")i");
    }
    public void multiply(Complex c) {
        System.out.print("Multiplication: ");
        double realPart = (this.real * c.real) - (this.imag * c.imag);
        double imagPart = (this.real * c.imag) + (this.imag * c.real);
        System.out.println("(" + realPart + ") + (" + imagPart + ")i");
    }
}
public class prac_3_6 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }
}
