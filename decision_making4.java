/* 
Q. Get the marks (an integer) from the user as input and output the grades along with the number of conditional expressions executed for determining the grades. Assign grades according to the following table.
A+ : 95- 100
A : 90-94 
B+ : 80 - 89
B : 75 -79
C+ : 70 - 74
C : 60 - 69
D- : 50-59
P : 40- 49
F : below 40


*/

import java.util.Scanner;
public class decision_making4
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your marks : ");
			int marks=sc.nextInt();
			if((marks>=95)&&(marks<100))
				{
					System.out.println("Grade is A+");
				}
			else if((marks>=90)&&(marks<94))
				{
					System.out.println("Grade is A ");
				}
			else if((marks>=80)&&(marks<89))
				{
					System.out.println("Grade is B+ ");
				}
			else if((marks>=75)&&(marks<79))
				{
					System.out.println("Grade is B ");
				}
			else if((marks>=70)&&(marks<74))
				{
					System.out.println("Grade is C+ ");
				}
			else if((marks>=60)&&(marks<69))
				{
					System.out.println("Grade is C ");
				}
			else if((marks>=50)&&(marks<59))
				{
					System.out.println("Grade is D- ");
				}
			else if((marks>=40)&&(marks<49))
				{
					System.out.println("Grade is P ");
				}
			else
				{
					System.out.println("Grade is F ");
				}
		}
}
