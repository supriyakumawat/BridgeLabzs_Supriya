package com.bridgelabzs.algorithm;

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class temperaturConversion 
{
	static
	{
		// It is used to tell what is that programe
		System.out.println(">> $$$$$$$ temperaturConversion Programes $$$$$$<<");
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Enter temperature To that is calculating temp in Fahrenheit : ");
		int Fahrenhei=scanner.nextInt();
		Utility.tempFahrenhei(Fahrenhei);
		
	}
}
