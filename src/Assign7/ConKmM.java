package Assign7;
import java.util.Scanner;
public class ConKmM
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Distance in KM");
		float km = sc.nextFloat();
	
		float Meter =(float) km*1000;
	
		System.out.println("The Distance in metre is :"+Meter);
	}
	public static void main(String args[])
	{
		show();
	}
}
