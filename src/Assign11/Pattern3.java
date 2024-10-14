package Assign11;
import java.util.Scanner;
public class Pattern3
{
	static void show()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for rows :");
		int num1 = sc.nextInt();
		System.out.println("Enter the number for columns :");
		int num2 = sc.nextInt();
		
		for(int i=0;i<num1;i++)
		{
				for(int j=0;j<num2;j++)
				{
					if(i%2==0)
					System.out.print((char)+('A'+i)+" ");
					else
					System.out.print((char)+('a'+i)+" ");
				}
				System.out.println();
		}
	}
	public static void main(String args[])
	{
		show();
	}
	
}
