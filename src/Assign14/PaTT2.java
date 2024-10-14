package Assign14;
import java.util.Scanner;
public class PaTT2 
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
			for(int j=num2;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		show();
	}
}
