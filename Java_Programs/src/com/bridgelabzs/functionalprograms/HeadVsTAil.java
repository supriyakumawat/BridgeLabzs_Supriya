package com.bridgelabzs.functionalprograms;
/**
*  Purpose: It is used to print HeadVsATial.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;
public class HeadVsTAil 
{
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.print(">> Tose a Coin : ");
			int lflips=scanner.nextInt();
			Utility.headVsTail(lflips);
			
		}
}
