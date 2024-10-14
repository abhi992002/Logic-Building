package Assign9;
import java.util.Scanner;
public class PattQ5
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the any number :");
		int num1 = sc.nextInt();
		
		for(int i=1;i<=2*num1;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
