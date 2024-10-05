package Assign1;
import java.util.Scanner;
public class Star 
{
	void print()
	{
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0; i<a;i++)
		{
			System.out.print("*");
		}
	
	}
	public static void main(String args[])
	{
		Star obj = new Star();
		obj.print();
	}
	
}
