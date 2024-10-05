package Assign5;
import java.util.Scanner;

public class ZeroShow 
{
	public void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int num1 = sc.nextInt();
		
		String num = Integer.toString(num1);
		if(num.contains("0"))
		{
			System.out.println("It contains Zero");
		}
		else
		{
			System.out.println("There is no Zero");
		}
		sc.close();
	}
	public static void main(String args[])
	{
		ZeroShow obj = new ZeroShow();
		obj.show();
	}
}
