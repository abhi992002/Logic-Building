package Assign8;
import java.util.Scanner;
public class AddRange 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int num2 = sc.nextInt();
		int sum=0;
		
		if(num1<=num2 && num1>=0 && num2>=0)
		{
			for(int i=num1;i<=num2;i++)
			{
				sum=sum+i;
			}
		}
		else
		{
			System.out.println("Invalid Range");
		}
	}
	public static void main(String args[])
	{
		show();
	}
}
