/*
	Q.Program to build a CALCULATOR .
*/


public class test {
	public static void main(String args[])
	{
		int a=10,b=5;
		calc c=new calc();
		System.out.println("Sum ="+c.add(a,b));
		System.out.println("Difference:"+c.sub(a,b));
		System.out.println("Multiplication :"+c.multiply(a, b));
		System.out.println("Division:"+c.divide(a,b));
		System.out.println("Remainder:"+c.modulo(a,b));
	}

}

class calc{
	
	public int add(int x, int y)
	{
		return (x+y);
	}
	public int sub(int x,int y)
	{
		return (x-y);
	}
	public int multiply(int x,int y)
	{
		return (x*y);
		
	}
	
	public int divide(int x,int y)
	{
		return (x/y);
		
	}
	public int modulo(int x,int y)
	{
		return (x%y);
	}
	

}
