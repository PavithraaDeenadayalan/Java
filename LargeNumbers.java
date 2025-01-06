import java.io.*;
import java .util.Scanner;
public class LargeNumbers {

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
System .out.print("Enter number1:");
int num1 =scan.nextInt();
System.out.print("Enter number 2:");
int num2= scan.nextInt();
System.out.print("enter number3:");
int num3=scan.nextInt();
if(num1 <num2 && num2>num3) {

System.out.println("The largest number is;"+num2);

}

else if(num2<num1 && num1>num3) {

System.out.println("The largest number is:"+num1);

}

else {

System.out.println("The largest number is:"+num3);
scan.close();
}

} }

