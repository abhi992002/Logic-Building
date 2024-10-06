package Assign7;
import java.util.Scanner;
public class Celsius 
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the temperature in Farenhit");
		float fht = sc.nextFloat();
	
		float celsius =(float) (fht-32)*5/9;
	
		System.out.println("The tempearture in celsius is :"+celsius);
	}
	public static void main(String args[])
	{
		show();
	}
}
