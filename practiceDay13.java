import java.util.*;

// Que 1 -- Printthesum,differenceandproductoftwocomplexnumbersbycreatingaclassnamed'Complex'withseparatemethodsforeachoperationwhoserealandimaginaryparts are entered by the user

/* 
public class practiceDay13 {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(7, 8);

        c1.display();
        c2.display();

        Complex c3 = new Complex();

        c3 = c1.add(c2);
        c3.display();

        Complex c4 = new Complex();

        c4 = c1.diff(c2);
        c4.display();

        Complex c5 = new Complex();

        c5 = c1.product(c2);
        c5.display();
    }
}

class Complex {
    int real;
    int imag;

    Complex() {
        // do nothing
    }

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void display() {
        System.out.println(real + "+" + imag + "i");
    }

    Complex add(Complex c2) {
        Complex res1 = new Complex();

        res1.real = real + c2.real;
        res1.imag = imag + c2.imag;

        return (res1);
    }

    Complex diff(Complex c2) {
        Complex res2 = new Complex();

        res2.real = real - c2.real;
        res2.imag = imag - c2.imag;

        return (res2);

    }

    Complex product(Complex c2) {
        Complex res3 = new Complex();

        res3.real = (real * c2.real) - (imag * c2.imag);
        res3.imag = (real * c2.imag) + (imag * c2.real);

        return (res3);
    }
}
*/

//Que 2 -- what is the output of the following code?

class practiceDay13 {

    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}

class Automobile {
    private String drive() {
        return "Driving Vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving Car";
    }
}

public class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving Electric Car";
    }

}