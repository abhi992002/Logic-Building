package Assign7;
import java.util.Scanner;
public class Sqfeet
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the area in Square feet");
		double sqar = sc.nextDouble();
	
		double sqmtr =(double) sqar*0.0929;
	
		System.out.println("The area of Rectangle is :"+sqmtr);
	}
	public static void main(String args[])
	{
		show();
	}
}
