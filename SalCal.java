import java.io.*;
import java.util.Scanner;
public class SalCal
{
	public static void main(String[] args) 
	{
		double basicPay = 1000;
		double daPercentage = 70;
		double hraPercentage = 10;
		double da = basicPay * (daPercentage/100);
		double hra = basicPay * (hraPercentage/100);
		double pf = basicPay * 0.12;
		double salary = basicPay + da + hra - pf;
		System.out.println("Salary: "+String.format("%.2f", salary));
	}
}