import java.io.*;
import java.util.Scanner;
class StudentClass
{

String[] Name=new String[3];
String[] Course=new String[3];
int[] Iot1=new int[3];
int[] C_Programming=new int[3];
int[] Python_Programming=new int[3];
int[] total=new int[3];
int[] UID=new int[3];
int[] Average=new int[3];
int i;
void Takedata()
{
Scanner sc=new Scanner(System.in);
for(i=0;i<3;i++)
{
System.out.println("Enter name of student "+(i+1));
Name[i]=sc.next();
System.out.println("Enter Course of Student "+(i+1));
Course[i]=sc.next();
System.out.println("Enter unique id of student "+(i+1));
UID[i]=sc.nextInt();
System.out.println("Enter Iot 1 marks for student "+(i+1));
System.out.println("Enter Iot 1 marks for student "+(i+1));
Iot1[i]=sc.nextInt();
System.out.println("Enter C programming marks for student "+(i+1));
C_Programming[i]=sc.nextInt();
System.out.println("Enter Python programming marks for student "+(i+1));
Python_Programming[i]=sc.nextInt();
}
}
void Tocalculate()
{
for(i=0;i<3;i++)
{
total[i]=Iot1[i]+C_Programming[i]+Python_Programming[i];
Average[i]=total[i]/3;
}
}
void Showdata()
{
for(i=0;i<3;i++)
{
System.out.println("Name :"+Name[i]+"\nUnique id :"+UID[i]+"\n Course :"+Course[i]);
System.out.println("Iot 1 marks :"+Iot1[i]);
System.out.println("C programming marks :"+C_Programming[i]);
System.out.println("Python programming marks :"+Python_Programming[i]);
System.out.println("The total :"+total[i]);
System.out.println("The average of the marks are "+Average[i]);
System.out.print("\n");
}
}
public static void main(String[] args)
{
Student3 obj=new Student3();
obj.Takedata();
obj.Tocalculate();
obj.Showdata();
}
}