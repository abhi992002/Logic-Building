package Assign8;
import java.util.Scanner;
public class RangeReverse 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		
		for(int i=num2; i>=num1; i--)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
