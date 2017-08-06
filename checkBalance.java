import java.util.Scanner;
public class checkBalance {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		work w=new work();
		String s;
		s=sc.nextLine();
		System.out.println(s);
		w.input(s);
	}

}


 class work {
	stack s=new stack();
	void input(String t)
	{
		
		int i,j,k,f=0;
		
		for(i=0;i<t.length();i++)
		{
			if((t.charAt(i)=='{')||(t.charAt(i)=='[')||(t.charAt(i)=='('))
			{
				s.push(t.charAt(i));
				
			}
			else
			{
				j=s.isempty();
				
				k=verify(t.charAt(i));
		
				if ((j==0)&&(k==1))
						{
					s.pop();
					
						}
				else 
				{
					f=-1;
					break;
				}
			}
		}
		j=s.isempty();
		if((j==1)&&(f==0))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
		
	}
	int verify(char x)
	{
		if(x=='}')
		{
			if(s.top()=='{')
			{
				return 1;
			}
			else
				return 0;
		}
		if(x==')')
		{
			if(s.top()=='(')
			{
				return 1;
			}
			else
				return 0;
		}
		if(x==']')
		{
			if(s.top()=='[')
			{
				return 1;
			}
			else
				return 0;
		}
		else return 0;
	}

}


 class stack {
	char[] a=new char[20];
	int top=-1;
	void push(char x)
	{
		top++;
		a[top]=x;
	}
	void pop()
	{
		top--;
	}
	int isempty()
	{
		if(top==-1)
		{
			return 1;
		}
		else return 0;
	}
	char top()
	{
		return a[top];
	}

}
