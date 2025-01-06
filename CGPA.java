import java.io.*;
import java.util.Scanner;
public class CGPA
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the CGPA: ");
		double cgpa = scanner.nextDouble();
		if (cgpa>= 9.0 &&cgpa<= 10) 
		{
			System.out.println("outstanding");
		} 
		else if (cgpa>= 8.0 &&cgpa< 9.0) 
		{
			System.out.println("excellent");
		} 
		else if (cgpa>= 7.0 &&cgpa< 8.0) 
		{
			System.out.println("good");
		} 
		else if (cgpa>= 6.0 &&cgpa< 7.0) 
		{
			System.out.println("average");
		} 
		else if (cgpa>= 5.0 &&cgpa< 6.0) 
		{
			System.out.println("below average");
		} 
		else if (cgpa< 5.0) 
		{
			System.out.println("poor");
		}
	}
}