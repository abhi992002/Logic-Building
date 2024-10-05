package Assign4;
import java.util.Scanner;
public class RevFactor 
{
	static void revfac()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any no");
		int num = sc.nextInt();
		for(int i=num-1;i>0;i--)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String args[])
	{
		revfac();
	}
}
