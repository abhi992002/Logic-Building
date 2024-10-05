package Assign3;
import java.util.Scanner;

public class EvenPrint 
{
	static void show()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no :");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
				int sum=2*i;
				System.out.println(sum);
		}
	}
	public static void main(String args[])
	{
		show();
	}
}
