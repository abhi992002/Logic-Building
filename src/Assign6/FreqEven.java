package Assign6;
import java.util.Scanner;
public class FreqEven {

	static void show()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int count=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit%2==0)
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
