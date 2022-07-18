package com.oopbasics;

public class SimpleInt {
	static int simpleInt;
	static int principle;
	static int rate;
	static int time;
	static int totalAmount;
	static void simpleInterest() {
	simpleInt = ((principle*rate*time)/100);
	System.out.println("SimpleInterest = " + simpleInt);
	totalAmount = principle + simpleInt;
	System.out.println("Amount to be paid after Loan = " + totalAmount);
	}

}
