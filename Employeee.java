import java.io.*;
import java.util.Scanner;
public class Employeee
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of hours worked: ");
		double hours = sc.nextDouble();
		System.out.println("Enter the hourly rate: ");
		double rate = sc.nextDouble();
		double pay;
		if (hours <= 40)
 		{
			pay = hours * rate;
		}
 		else 
		{
			pay = 40 * rate + (hours - 40) * rate * 1.5;
		}
		System.out.println("The pay earned by the employee is: Rupees" + String.format("%.2f", pay));
	}
}