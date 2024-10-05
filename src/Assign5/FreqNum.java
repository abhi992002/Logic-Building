package Assign5;
import java.util.Scanner;

public class FreqNum 
{
	static void show(int num)
	{
		int count=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit==2)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num1 = sc.nextInt();
		show(num1);
	}
}
