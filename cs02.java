//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java
import java.util.Scanner;
class Geeks{
     public static void main(String args[]){

        IOFunction();
    }
    
    // Function to take input using Scanner class
    public static void IOFunction(){
        Scanner scan = new Scanner(System.in);
        int a;
        float b;
        long c;
        byte d;
        String s =" ";
        
		 a = scan.nextInt();
		 b = scan.nextFloat();
		 c = scan.nextLong();
		 d = scan.nextByte();
		scan.nextLine();
		 s = scan.nextLine();
		
		System.out.println(a);
		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(s);

		
    }
   
    
}