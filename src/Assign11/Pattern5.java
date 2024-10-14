package Assign11;
import java.util.Scanner;
public class Pattern5
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for rows :");
		int num1 = sc.nextInt();
		System.out.println("Enter the number for columns :");
		int num2 = sc.nextInt();
		int num=1;
		for(int i=1;i<=num1;i++)
		{
				for(int j=1;j<=num2;j++)
				{
					System.out.print(num+" ");
					num++;
				}
				System.out.println();
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
