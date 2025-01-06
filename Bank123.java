import java.io.*;
class Bank123
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
class TestInheritance
{
	public static void main(String args[])
	{
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		AXIS b3=new AXIS();
		System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());
	}
}