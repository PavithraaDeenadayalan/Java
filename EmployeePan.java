import java.io.*;
public class EmployeePan
{
	public static void main(String[] args) 
	{
		double[] hours = {2, 3, 1, 5, 7};
		double rate = 500.00;
		for (int i = 0; i<hours.length; i++) 
		{
			if(hours[i] >= 2) 
			{
				double pay = hours[i] * rate;
				System.out.println(String.format("%.2f", pay));
			}
			else
			{
				System.out.println("NA");
			}
		}
	}
}