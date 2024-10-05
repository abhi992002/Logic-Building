package Assign4;
import java.util.Scanner;
public class FacDiff 
{
	static void show()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no:");
		int num = sc.nextInt();
		int sum=0;
		int sum1=0;
		int DiffSum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Factors are :"+i);
				sum=sum+i;
			}
			else if(num%i!=0)
			{
				System.out.println("Non Factors are :"+i);
				sum1=sum1+i;
			}
		}
		DiffSum=sum-sum1;
		System.out.println("Sum of Factors are :"+sum);
		System.out.println("Sum of Non Factors are :"+sum1);
		System.out.println("Difference Summation of Factors are :"+DiffSum);
	}
	public static void main(String args[])
	{
		show();
	}
}
