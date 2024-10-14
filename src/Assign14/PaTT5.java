package Assign14;
import java.util.Scanner;
public class PaTT5
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no:");
		int num1 = sc.nextInt();
		System.out.println("Enter second no:");
		int num2 = sc.nextInt();
		
		for (int i = 0; i < num1; i++) 
		{
            for (int j = 0; j < i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = i + 1; j <= num2; j++) 
            {
                System.out.print(j + " ");
            }
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		show();
	}
}
