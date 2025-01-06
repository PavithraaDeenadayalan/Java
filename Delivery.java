import java.io.*;
import java.util.Scanner;
class Delivery
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
            System.out.println("Enter the weight of your parcel:");
		int weight=sc.nextInt();
		System.out.println("Enter the distance(kM) from office to delivery place:");
		double distance =sc.nextDouble();
            double fuel=distance*0.4;
		double price=fuel*90;
            int del;
		switch(weight){
				case 4:{
				del=20;
				}break;
				case 5:{	
				del=25;
				}
				break;
				case 6:{
				del=30;
				}break;
                        case 7:{
				del=35;
				}break;
				case 8:{
				del=40;
				}break;
				case 9:{
				del=45;
				}break;
				case 10:{
				del=50;
				}break;
				default:{
				del=40;
				}break;
				}
		double charge=price+del;
		System.out.println("Amount to be paid:"+charge);
		
	}
}

