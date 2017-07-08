/* 
Write a program to read three numbers & calculate their sum & average.
 If sum is in the range of 100 & 200 print the message, “Sum is in the allowed range”.
 Else, print the message, “Sum has exceeded the range”.
*/

import java.util.Scanner;
public class decision_making3
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st number : ");
			int num1=sc.nextInt();
			System.out.println("Enter 2nd number : ");
			int num2=sc.nextInt();
			System.out.println("Enter 3rd number : ");
			int num3=sc.nextInt();
			int sum=0;
			sum=num1+num2+num3;
			if((sum>100)&&(sum<200))
				{
					System.out.println("Sum is in allowed range!");
				}
			else 
				{
					System.out.println("Sum has exceeded the range");
				}
		}
}
