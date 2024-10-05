package Assign2;
import java.util.Scanner;
public class PrintHello 
{
	void print()
	{	
		System.out.println("Enter number to check");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=10)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Demo");
		}
	}
	public static void main(String args[])
	{
		PrintHello obj= new PrintHello();
		obj.print();
	}
}
