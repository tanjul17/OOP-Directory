import java.net.PortUnreachableException;

import javax.lang.model.element.Element;
import javax.management.relation.Relation;

public class Questions {
    public static void main(String[] args) {
        Complex c1 = new Complex(9,5);
        Complex c2 = new Complex(4, 6);
        
        Complex c3 = Complex.add(c1, c2);
        Complex c4 = Complex.diff(c1, c2);
        Complex c5 = Complex.product(c1, c2);

        c3.printComplex();
        c4.printComplex();
        c5.printComplex();


    }

}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real) - (a.imag * b.imag), (a.real * b.real) - (a.imag * b.imag));
    }

   public void printComplex(){
    if(real ==0 && imag !=0){
        System.out.println(imag+"i");

    }
    else if (imag ==0 &&real!=0){
        System.out.println(real);
    }
    else{
        System.out.println(real +"+"+imag +"i");
    }
   }
}