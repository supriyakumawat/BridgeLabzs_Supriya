package com.bridgelabzs.algorithm;

/**
*  Purpose: Insertion sort it is used to sort a String Array.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/
import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class InsertionSortOFString
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Enetr any Size of String Array : ");
		int lsize=scanner.nextInt();
		String s[]=new String[lsize];
		
		System.out.println(">> Enter elements for a String");
		
		// It is used to enter a element in array by using for loop
		for(int i=0;i<s.length;i++)
		{
			s[i]=scanner.nextLine();
		}
		
		System.out.println(">> Given String is : ");
		
		//It is forEach Loop is used to print String  Array
		for(String str:s)
		{
			System.out.println(str+" ");
		}
		
		// Call the Utility package through insertOnString Method 
		
		String copy[]=Utility.insertOnString(s);
		
		System.out.println(">> After Sorting Given String Array is : ");
		
		//It is forEach Loop is used to print String  Array
		for(String str:copy)
		{
			System.out.println(str);
		}
	}
}
