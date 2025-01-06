import java.io.*;
import java.util.Scanner;  
public class PowerOfNumber 
{  
public static void main(String args[])   
{  
int base, exponent, expo;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number: ");  
base=sc.nextInt();  
System.out.print("Enter the exponent: ");  
exponent=sc.nextInt();  
expo=exponent;  
long power = 1;  
while (exponent != 0)   
{        
power = power * base;    
--exponent;  
}  
System.out.println(base +" to the power " +expo + " is: "+power);  
}  
}  
