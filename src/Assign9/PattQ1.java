package Assign9;
import java.util.Scanner;
public class PattQ1 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		
		for(int i=0;i<num1;i++)
		{
			System.out.println((char)('A'+i));
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
