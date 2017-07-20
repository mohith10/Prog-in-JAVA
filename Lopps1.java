/*
           Q.Write a JAVA Program to print multiplication table for given number upto 20.
*/
       import java.util.Scanner;

public class Loops1
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int i,n;
			System.out.print("Enter the number :");
			n=sc.nextInt();
			for(i=1;i<=20;i++)
			{
				System.out.println(i+"*"+n+"="+i*n);
			}




		}

}
