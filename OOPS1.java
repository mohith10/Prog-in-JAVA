/*
	Object Oriented Programing CONCEPTS
*/

public class test {
	public static void main(String args[])
	{
		triangle t=new triangle();
		rhombus r=new rhombus();
		System.out.println("Area of Trinagle "+t.calculate(10,5));
		System.out.println("Area of Rhombus "+r.calculate(10,20));
	}

}

class triangle{
	 float calculate(float a,float b)
	{
		float f=0.5F;
		return (f*a*b);
	}

}



class rhombus {
	
	float calculate(float a,float b)
	{
		float f=0.5F;
		return(a*b*f);
		
	}

}



