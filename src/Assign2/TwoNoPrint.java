package Assign2;
import java.util.Scanner;
public class TwoNoPrint 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any no :");
		int num1 = sc.nextInt();
		System.out.println("Enter print no counts  :");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num2;i++)
		{
			System.out.println(num1);
		}
		
	}
public static void main(String args[])
{
	show();
}
}
