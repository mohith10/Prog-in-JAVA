/*
            Program to check whether the entered matrix is symettric or not.
 */
import java.util.Scanner;

public class 2dArray1
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int f=0;
			int a[][]=new int[4][4];
			int b[][]=new int[4][4];
			System.out.println("Enter the matrix values:");
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=3;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("The matrix A : ");
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=3;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("The transpose of matrix A : ");
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=3;j++)
				{
					b[i][j]=a[j][i];
				}
			}
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=3;j++)
				{
					System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=3;j++)
				{
					if(b[i][j]!=a[i][j])
					{
						f=-1;
						break;
					}
				}
				
			}
			if(f==0)
			{
				System.out.println("Bingo!Both are same !");
			}
			else
			{
				System.out.println("Sorry!Both are not same!");
			}







		}

}
