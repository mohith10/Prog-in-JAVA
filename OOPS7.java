/*
    Addition of complex no //Demonstrating Passing objects to function
 */
import java.util.Scanner;
//Passing OBJECT to a METHOD

class Complex
{
	int real,imaginary,addReal,addComplex;

	void getInput(int r,int i)
	{
		real=r;
		imaginary=i;
	}
	void addComplex(Complex o)
	{
		addReal=real+o.real;
		addComplex=imaginary+o.imaginary;
	}
	void getOutput()
	{
		System.out.println("Addition is :"+addReal+"+i"+addComplex);  //WRITTING IN THE FORM OF "x+iy"
	}
}

public class OOPS7
{
	public static void main(String args[])
	{
		Complex C1=new Complex();
		Complex C2=new Complex();
		Scanner sc=new Scanner(System.in);
		int real,image;
		System.out.print("Real part of COMPLEX 1 :");
		real=sc.nextInt();
		System.out.print("Imaginary part of COMPLEX 1 :");
		image=sc.nextInt();
		C1.getInput(real,image);
		System.out.print("Real part of COMPLEX 2 :");
		real=sc.nextInt();
		System.out.print("Imaginary part of COMPLEX 2 :");
		image=sc.nextInt();
		C2.getInput(real,image);
		C1.addComplex(C2);
		C1.getOutput();

	}
}
