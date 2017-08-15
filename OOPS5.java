/*
Demonstrating the concept of constructors and inheritance
*/

class MotorVehicle
{
	String modelName;
	int modelNumber,modelPrice;

	MotorVehicle (String s,int a ,int b)
	{

		modelName=s;
		modelNumber=a;
		modelPrice=b;

	}
	void display()
	{
		System.out.println("Name: "+modelName);
		System.out.println("Number: "+modelNumber);
		System.out.println("Price: "+modelPrice);
	}
}

class Car extends MotorVehicle
{
	float discountRate;
	Car (String s,int a ,int b,float d)
	{
		super(s,a,b);
		discountRate=d;

	}
	void display()					               
	{
		System.out.println("Name: "+modelName);
		System.out.println("Number: "+modelNumber);
		System.out.println("Price: "+modelPrice);
		float d;
		d=discount();

		System.out.println("Discount : "+d);


	} 	
	float discount()
	{
		
		if(modelPrice<1000)
		{
			discountRate=0.1F;
			return discountRate;
		}
		else if((modelPrice>1000)&&(modelPrice<=2000))
		{
			discountRate=0.5F;
			return discountRate;
		}
		else if(modelPrice>2000)
		{
			discountRate=0.9F;
			return discountRate;
		}
		return 0F;
	}					

}

public class one
{
	public static void  main(String args[])
	{
		
		Car c=new Car("Maruti",007,5000,0.9F);
		c.display();
		
		




	}
}
