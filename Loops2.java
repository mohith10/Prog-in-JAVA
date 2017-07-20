
            import java.util.Scanner;

public class Loops2
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int i,n1,sum1=0,n2,sum2=0;
			
			System.out.print("Enter the 1st number :");
			n1=sc.nextInt();
			System.out.print("Enter the 2nd number :");
			n2=sc.nextInt();
			for(i=1;i<n1;i++)
			{
				if(n1%i==0)
				{
					sum1=sum1+i;
				}
			}
			for(i=1;i<n2;i++)
			{
				if(n1%i==0)
				{
					sum2=sum2+i;
				}
			}

			if(sum1==sum2)
			{
				System.out.println("Amicable Number");
			}
			else
				System.out.println("Not an amicable number!");


		}

}
