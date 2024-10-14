package Assign12;
import java.util.Scanner;
public class PAT1
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
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				for(int k=i+1;k<=num2;k++)
				{
					System.out.print("# ");
				}
				System.out.println();
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
