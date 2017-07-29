/*
	Q.Implement a function minimum() to return the minimum element in a stack.
*/
public class stack2 {
	public static void main(String args[])
	{
		
		minFind si=new minFind();
		si.push(100);
		si.push(200);
		si.push(300);
		si.push(400);
		si.push(500);
		si.print();
		int min=si.minimum();
		System.out.println("\nMinimum Value Element : "+min);
		
		
		
	}

}

class minFind {
	int[] arr=new int[5];
	int top=-1;
	
	minFind()  //Usage of Constructor
	{
		arr=new int[5];
		top=-1;
		
	}
	
	public void print()
	{
		int i;
		System.out.println();
		for(i=0;i<=top;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	void push(int x)
	{
		try{
			top++;
		arr[top]=x;
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println();
		System.out.println("Sorry!POP Something");
	}
		
	}
	
	public int pop()
	{
		
		top--;
		if(top>=-1)
		{
			System.out.println("\nPOPED!");
		return arr[top+1];
		}
		else 
		{
			System.out.println("\n PUSH Something!");
			return 0;
		}
	}
	
	public int minimum()
{
	int i;
	int min=arr[0];
	for(i=1;i<=top;i++)
	{
		if(min>arr[i])
		min=arr[i];

	}
	return min;

}

}
