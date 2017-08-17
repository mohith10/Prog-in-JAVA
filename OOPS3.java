/*
Q. To find area of Different Polygons
*/

public class OOPS3 {
	public static void main(String args[])
	{
		triangle t=new triangle();
		rectangle r=new rectangle();
		polygon p=new polygon();
		hexagon h=new hexagon();
		octagon o=new octagon();
		System.out.println("Area of triangle : "+t.area(2,2)+" Perimeter of Traingle: "+t.perimeter(2, 2));
		System.out.println("Area of rectangle : "+r.area(2, 2)+" Perimeter of Rectangle: "+r.perimeter(2, 2));
		System.out.println("Area of pentagon : "+p.area(2, 2)+" Perimeter of Pentagon: "+p.perimeter(2, 2));
		System.out.println("Area of hexagon : "+h.area(2, 2)+" Perimeter of Hexagon: "+h.perimeter(2, 2));
		System.out.println("Area of octagon : "+o.area(2, 2)+" Perimeter of Ocatagon: "+o.perimeter(2, 2));
		
		
	}

}

class hexagon  {
	public float area(float a,float b)
	{
		return (2.598F*a*a);
	}
	public float perimeter (float a,float b)
	{
		return (6*a);
	}

}
class octagon{
	public float area(float a,float b)
	{
		return (4.8284F*a*a);
	}
	public float perimeter (float a,float b)
	{
		return (8*a);
	}

}

class polygon{
	public float area(float a,float b)
	{
		return (1.7204F*a);
	}
	public float perimeter (float a,float b)
	{
		return (5*a);
	}

}

class rectangle{
	public float area(float a,float b)
	{
		return (a*b);
	}
	public float perimeter(float a,float b)
	{
		return (2*(a+b));
	}

}
class triangle{

		public float area(float a,float b)
		{
			return (0.866F*a);
		}
		public float perimeter(float a,float b)
		{
			return (3*a);
			
		}
		
}
