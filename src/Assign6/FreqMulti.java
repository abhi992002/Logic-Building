package Assign6;
import java.util.Scanner;
public class FreqMulti {

	static void show()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int multi=1;
		while(num>0)
		{
			int digit=num%10;
			multi=multi*digit;
			num=num/10;
		}
		System.out.println(multi);
	}
	public static void main(String args[])
	{
		show();
	}
}
