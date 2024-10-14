package Assign9;
import java.util.Scanner;
public class PattQ4
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the any number :");
		int num1 = sc.nextInt();
		
		for(int i=1;i<=num1;i++)
		{
			System.out.print("# " + i+ " * ");
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
