package com.bridgelabzs.functionalprograms;
/**
*  Purpose: It is used to find a distance.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;
public class Distance
{
		public static void main(String[] args) 
		{
			int lx=0,ly=0;
			Scanner scanner=new Scanner(System.in);
			System.out.println(">> Enter Any Two Numbers : ");
			int lx2=scanner.nextInt();
	     	int ly2=scanner.nextInt();
	     	Utility.distance(lx2,ly2);
		}

}
