import java.io.*;
import java.util.Scanner;
public class LargestElement_array {  
    public static void main(String[] args) { 
        int [] arr = new int [] {2545, 9876511, 98765437, 9987675, 8765556};    
        int max = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
} 