

/*
Q. Write a program to test if the number input is positive, negative or zero.
*/


import java.util.Scanner;
public class decision_making2
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num=sc.nextInt();
			if(num>0)
				{
					System.out.println("Positive !");
				}
			else if (num<0)
				{
					System.out.println("Negative !");
				}
			else 
				{
					System.out.println("Zero !");
				}
		}
}
