//WAP to print No of EMI for a given amount of loan for a given number of years or month. You have to fetch the interest rate from the xml file and loam amount and rate of interest is 
//entered by you.

package com.yash.emicalculate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		try {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yash/emicalculate/applicationContext.xml");
			EMICalculate emi=(EMICalculate)ctx.getBean("emi");
			double rate=emi.getInterestRate();
			System.out.println(emi.emiCalculate(rate));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
