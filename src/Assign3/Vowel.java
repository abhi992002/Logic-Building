package Assign3;
import java.util.Scanner;
public class Vowel 
{
	public void show(char ch)
	{
		
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Character is vowel");
		}
		else
		{
			System.out.println("Character is not vowel");
		}
	}
	public static void main(String args[])
	{
		char ch1;
		System.out.println("Enter any character");
		Scanner sc=new Scanner(System.in);
		ch1=sc.next().charAt(0);
		Vowel obj =new Vowel();
		obj.show(ch1);
	}
}
