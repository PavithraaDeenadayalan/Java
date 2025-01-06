import java.io.*;
import java.util.Scanner;
class AreaOfRectangle
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length:");
		double l = scan.nextDouble();
		System.out.println("Enter the breadth:");
		double b = scan.nextDouble();
		double area = l*b;
		System.out.println("Area of the Rectangle :"+area);
	}
}