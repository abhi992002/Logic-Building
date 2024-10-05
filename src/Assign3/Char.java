package Assign3;
import java.util.Scanner;
public class Char 
{
	static void show()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println((char)(ch-32));
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println((char)(ch+32));
		}
		else
		{
			System.out.println("Invalid Character");
		}
	}
	public static void main(String args[])
	{
		show();
	}
}
