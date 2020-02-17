package com.epam.Interest;

import java.text.DecimalFormat;

import java.util.*;
public class Client_application 
{
	private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main( String[] args )
    {
    	Scanner scan=new Scanner(System.in);
		 String str=null;
		 Calculate_interest obj=new Calculate_interest();
		System.out.println("Enter the principle amount");
        double principle=scan.nextDouble();
        System.out.println("Enter the time period");
        double time_period=scan.nextDouble();
        System.out.println("Enter the rate of interest");
        double rateofinterest=scan.nextDouble();
        do {
        System.out.println("1.Simple Interest\n2.Compound Interest");
        System.out.println("Enter the choice");
        int choice=scan.nextInt();
        switch(choice)
        {
        case 1:
       	  System.out.println(df.format(obj.getSimpleInterest(principle,time_period,rateofinterest)));
       	  break;
        case 2:
       	 System.out.println(df.format(obj.getCompoundInterest(principle,time_period,rateofinterest)));
       	  break;
        }
        System.out.println("Do you want to continue Y/N?");
        str=scan.next();
	}while(str.equalsIgnoreCase("Y"));
        scan.close();
    }
}

