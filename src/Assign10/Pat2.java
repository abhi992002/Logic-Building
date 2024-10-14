package Assign10;
import java.util.Scanner;
public class Pat2
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for rows :");
		int num1 = sc.nextInt();
		System.out.println("Enter the number for columns :");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num1;i++)
		{
				for(int j=1;j<=num2;j++)
				{
					System.out.print(j + " ");
				}
				System.out.println();
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
