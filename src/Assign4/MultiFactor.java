package Assign4;
import java.util.Scanner;
public class MultiFactor 
{
	static void show()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any no:");
		int num =sc.nextInt();
		int multi=1;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				multi=multi*i;
				System.out.println(i+" ");
			}
		}
		System.out.println("="+multi);
	}
	public static void main(String args[])
	{
		show();
	}
}
