import java.io.*;
import java.util.Scanner;
public class PositiveNegative{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter number:");
int num =scan.nextInt();
if(num>0) {
System.out.println("Positive");

}

else {

System.out.println("Negative");

}
scan.close();
}}