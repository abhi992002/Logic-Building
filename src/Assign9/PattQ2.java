package Assign9;
import java.util.Scanner;
public class PattQ2 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		
		for(int i=num1;i>0;i--)
		{
			System.out.print(i+" # ");
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
