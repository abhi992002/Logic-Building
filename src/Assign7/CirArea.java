package Assign7;
import java.util.Scanner;
public class CirArea 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float rad = sc.nextFloat();
	
		float area = (float)3.14*rad*rad;
	
		System.out.println("The radius of circle is :"+area);
	}
	public static void main(String args[])
	{
		show();
	}
}
