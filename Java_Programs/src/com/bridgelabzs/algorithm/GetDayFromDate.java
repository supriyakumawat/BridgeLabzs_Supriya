package com.bridgelabzs.algorithm;
/********************************************************************
*  Purpose: IT GIVES YOU TO GATE DATE OF THE THAT DAY
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   06-03-2018
*
*********************************************************************/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDayFromDate 
{
	public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(now));

        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format

    }
}
