package semester2.assignment2;

import java.util.Scanner;
class Complex
{
    double real;
    double imag;

    void setData(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    void display()
    {
        System.out.println("The Complex number is: "+real+"+"+imag+"i");
    }

    public Complex add(Complex n1, Complex n2)
    {
        this.real = n1.real+n2.real;
        this.imag = n1.imag+n2.imag;

        return this;
    }

}

public class Q02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real part of the first num: ");
        double real = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first num: ");
        double imag = sc.nextDouble();
        Complex c1 = new Complex();
        c1.setData(real, imag);

        System.out.println("Enter the real part of the second num: ");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second num: ");
        double imag1 = sc.nextDouble();
        Complex c2 = new Complex();
        c2.setData(real1, imag1);

        Complex res = new Complex();
        res = res.add(c1,c2);

        res.display();

    }
}

/*
Enter the real part of the first num:
23
Enter the imaginary part of the first num:
63.64
Enter the real part of the second num:
12
Enter the imaginary part of the second num:
6.47
The Complex number is: 35.0+70.11i
 */