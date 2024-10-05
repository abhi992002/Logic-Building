package Assign5;
import java.util.Scanner;
public class Freqnum4 
{
	static void show()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		int num= sc.nextInt();
		
		
		int count=0;
		
		while(num>0)
		{
			int digit=num%10;
			if(digit==4)
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
