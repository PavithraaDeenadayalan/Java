import java.io.*;
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) 
	{
		int num1 , num2 , c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num1:");
		num1=scan.nextInt();
		System.out.println("Enter num2:");
		num2=scan.nextInt();
		c=0;
		while(c!= 5) 
		{
			System.out.println("options:");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Mul");
			System.out.println("4.Div");
			System.out.println("5.Quit");
			System.out.println("Enter your choice");
			c= scan.nextInt();
			switch(c) 
			{
				case 1:
				System.out.println("Add=" + (num1 + num2));
				break;

				case 2:
				System.out.println("Sub = " + (num1 - num2));
				break;

				case 3:
				System.out.println("Multi= " + (num1 * num2));
				break;

				case 4:
				System.out.println("Divd = " + (num1 / num2));
				break;

				case 5:
				System.out.println("Quit");
				break;
			}
		}
	}
}
