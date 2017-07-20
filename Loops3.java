import java.util.Scanner;
/* 
Q.Write a program that prints all the even numbers from 1 to 
m (m not included).
*/
public class Loops3
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int m,i;
	m=sc.nextInt();
	
	for(i=0;i<m;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}}
