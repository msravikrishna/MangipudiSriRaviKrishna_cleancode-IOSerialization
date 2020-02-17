package com.epam.Interest;

public class Calculate_interest {
   public double getSimpleInterest(double principle,double time,double rate_of_interest)
   {
	   double simple_interest=(principle*time*rate_of_interest)/100;
	   return simple_interest;
   }
   public double getCompoundInterest(double principle,double time,double rate_of_interest)
   {
	   double res=(1+(rate_of_interest/100));
	  double interest= Math.pow(res,time);
	  double compound_interest=interest*principle-principle;
	   return compound_interest;
   }
}
