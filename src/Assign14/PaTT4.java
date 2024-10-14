package Assign14;
import java.util.Scanner;
public class PaTT4
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no:");
		int num1 = sc.nextInt();
		System.out.println("Enter second no:");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num1;i++)
		{
			for(int j=1;j<=num2;j++)
			{
				if(i==j)
				{
					System.out.print("* ");
				}
				else if(j==num2 || i==num1 || i==1 || j==1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		show();
	}
}
