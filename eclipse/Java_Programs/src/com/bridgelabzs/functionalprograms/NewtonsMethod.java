package com.bridgelabzs.functionalprograms;
/**
*  Purpose: It is used to find NewtonsMethods.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;
public class NewtonsMethod 
{
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			
			System.out.print(">> Enter a Non-Negative number : ");
			 
			double lNonNeagativeNumber=scanner.nextInt();
			 
			Utility.newtonMethod(lNonNeagativeNumber);
		}	
		

}
