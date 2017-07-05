/* 
Q.Write a program to determine if a person is eligible for voting. Age has to be eighteen or above for a person to vote.
*/

import java.util.Scanner;
public class decision_making1
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age : ");
			int age=sc.nextInt();
			if(age>=18)
				{
					System.out.println("Eligible to vote!");
				}
			else
				{
					System.out.println("Not Eligible!");
				}
		}
}
