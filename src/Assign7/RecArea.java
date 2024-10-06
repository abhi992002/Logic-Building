package Assign7;
import java.util.Scanner;
public class RecArea 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the width of Rectangle");
		float wid = sc.nextFloat();
		System.out.println("Enter the Height of Rectangle");
		float hgt = sc.nextFloat();
	
		float area =(float) wid*hgt;
	
		System.out.println("The area of Rectangle is :"+area);
	}
	public static void main(String args[])
	{
		show();
	}
}
