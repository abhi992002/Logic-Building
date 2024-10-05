package Assign3;
import java.util.Scanner;
public class EvenFactor 
{
	static void show()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no :");
		int num = sc.nextInt();
		for(int i=1; i<num;i++)
		{
			if(num%i==0)
			{
				if(i%2==0)
				{
				System.out.println(i);
				}
			}
		}
	}
	public static void main(String args[])
	{
		show();
	}
}
