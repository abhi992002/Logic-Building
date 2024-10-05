package Assign4;
import java.util.Scanner;
public class NonFactor 
{
	static void nonFac()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any no:");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i!=0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("="+sum);
	}
	public static void main(String args[])
	{
		nonFac();
	}
}
