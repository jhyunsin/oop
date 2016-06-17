/**
 * 
 */
package controller;

/**
 * @date : 2016. 6. 14.
 * @author : hb2009
 * @file : Calc.java
 * @story :
 */
public class Calc {

	public String calc(int outa, String outop, int outb) {
		int sum = 0;
		int a = outa;
		int b = outb;
		String op = outop;
		switch (op) {
		case "+":
			sum = a + b;
			break;
		case "-":
			sum = a - b;
			break;
		case "*":
			sum = a * b;
			break;
		case "/":
			sum = a / b;
			break;
		case "%":
			sum = a % b;
			break;

		default:
			System.out.println("1~5까지만");

		}
		return a + op + b + "= " + sum;

	}
}
