package Assign12;
import java.util.Scanner;
public class PAT5
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
				if(j==1 || i==1 || i==num1 || j==num2)
				System.out.print(j+" ");
				else
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		show();
	}
}