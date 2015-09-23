package Tutioncalc;

import java.util.Scanner;

public class tuitioncalculator {

	public static void main(String[] args) {
	}

	Scanner input = new Scanner(System.in);
	double tuition;
	double ucosts;
	double APR;
	double years;
	double payback;
	double increase;
	double degreeprice;
	double realAPR;

	public void schoolFinances() {
		/**
		 * this method calculates the final price for a degree
		 */
		for (int x = 1; x < 9; x++) {
			System.out.println("Enter initial tuition: ");
			double i = input.nextDouble();
			tuition = i;
			System.out.println("Enter percent increase in decimal form: ");
			double p = input.nextDouble();
			ucosts = p;
			increase = i * p;
			tuition = increase + i;
			degreeprice += tuition;
		}
		System.out.println("The final price for a degree is" + degreeprice);
	}

	public void aPR() {
		/**
		 * this method calculates the payback rate for the APR
		 */
		System.out.println("Enter APR: ");
		double a = input.nextDouble();
		APR = a;
		System.out.println("Enter years for repayment: ");
		double y = input.nextDouble();
		years = y;
		realAPR = APR * tuition;
		payback = realAPR / 12;
		System.out.println("The monthly payback will be : " + payback);
	}

}
