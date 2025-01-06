import java.io.*;
import java.util.Scanner;
public class OddOrEven{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter number:");
int num =scan.nextInt();
if(num%2==0) {
System.out.println("even number");

}

else {

System.out.println("odd numbers");

}
scan.close();
}}