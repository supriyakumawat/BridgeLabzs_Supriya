/*********************************************************************************
*  Purpose: It is used to Convert a decimal Number into a binary number

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class Binary 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println(">> Enter any Decimal Number");
		int ldecimal=Utility.inputInteger();
		String binary=Utility.toBinary(ldecimal);
		System.out.println(binary);
	
	}
}