package Assign5;
import java.util.Scanner;
public class FreqLess6 
{
	static void show()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int count=0;
		while(num>0)
		{
			int digit=num%10;
			
			if(digit<6)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
	public static void main(String args[])
	{
		show();
	}
}
