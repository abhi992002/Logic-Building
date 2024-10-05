package Assign1;
import java.util.Scanner;

public class Divisibleby5 
{
	public void div()
	{
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%5==0)
		{
			System.out.println("Given no is divisible by 5");
		}
		else
		{
			System.out.println("Given no is not divisible by 5");
		}
	}
	public static void main(String args [])
	{
		Divisibleby5 obj= new Divisibleby5();
		obj.div();
	}
}
