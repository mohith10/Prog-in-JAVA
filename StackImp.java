/*
	Program to Implement STACK data strucutre and exhibit his basic functionalities.
*/
public class StackImp {
	public static void main(String args[])
	{
		
		StackInt si=new StackInt();
		System.out.println("Top:"+si.top);
		System.out.println("Array Length:"+si.arr.length);
		StackInt si2=new StackInt(20);
		System.out.println("NEW Array Length:"+si2.arr.length);
		System.out.println("Top(Object si2):"+si2.getTop());
		si.push(100);
		si.print();
		si.push(200);
		si.print();
		System.out.println("\nValue PEEKED :"+si.peek());
		si.push(300);
		si.print();
		si.push(400);
		si.print();
		si.pop();
		si.print();
		si.push(500);
		si.print();
		si.push(600);
		si.print();
		si.pop();
		si.print();
		System.out.println("\nValue PEEKED :"+si.peek());
		
		}
	}


class StackInt {
	int[] arr=new int[5];
	int top=-1;
	
	StackInt()  //Usage of Constructor
	{
		arr=new int[5];
		top=-1;
		
	}
	StackInt(int s) //Parameterized Constructor
	{
		arr=new int[s];
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
	public int getTop()
	{
		System.out.println();
		return top;
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
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("\nNothing to PEEK");
			return 0;
		}
		return arr[top];
		
	}
	

}
