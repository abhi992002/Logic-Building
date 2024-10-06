package Assign8;
import java.util.Scanner;
public class NumRange 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int num2 = sc.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		show();
	}
}
