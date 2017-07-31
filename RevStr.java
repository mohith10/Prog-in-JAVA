import java .util.Scanner;
public class RevStr {
	public static void main(String args[])
	{
		
		stringrev si=new stringrev();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of your String :");
		int n;
		n=sc.nextInt();
		char c;
		int i=0;
		while(i<n)
		{
		c = sc.next(".").charAt(0);
		si.push(c);
		i++;
		}
		si.print();
		si.reverse();
		si.printrev();
		
		
		
	}

}

class stringrev {
	char[] arr=new char[100];
	char[] a=new char[100];
	int top=-1;
	int top1=-1;

	public void print()
	{
		int i;
		System.out.println();
		for(i=0;i<=top;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void push(char x)
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

	public char pop()
	{
		
		top--;
		if(top>=-1)
		{
		return arr[top+1];
		}
		else 
		{
			System.out.println("\n PUSH Something!");
			return 0;
		}
	}

	public void reverse()
	{
	
	while(top!=-1)
	{
		char temp;
		temp=pop();
		pushrev(temp);
		
	}
	

	}
	public void pushrev(char x)
	{
		try{
			top1++;
		a[top1]=x;
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println();
		System.out.println("Sorry!POP Something");
	}
		
	}
	public void printrev()
	{
		int i;
		System.out.println();
		for(i=0;i<=top1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}


