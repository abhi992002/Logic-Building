package Assign5;
import java.util.Scanner;

public class DigitsRev 
{
	static void print()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			System.out.print(rem);
		}
	}
	public static void main(String args[])
	{
		print();
	}
}
