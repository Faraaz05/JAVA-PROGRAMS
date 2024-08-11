class ComplexNumber {
    double real, imag;

    ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void display() {
        System.out.println("Complex number: " + real + " + " + imag + "i");
    }
}

public class prac_3_7_d {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(3.0, 4.0);
        ComplexNumber result = addComplex(c1, c2);
        result.display();

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }

    public static ComplexNumber addComplex(ComplexNumber c1, ComplexNumber c2) {
        double realPart = c1.real + c2.real;
        double imagPart = c1.imag + c2.imag;
        return new ComplexNumber(realPart, imagPart);
    }
}

