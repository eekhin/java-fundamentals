/**
 * File Name: FunApp.java<br>
 * KHIN, EI EI<br>
 * Created: Aug 21, 2017
 */
package com.sqa.eiei;

/**
 * FunApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author KHIN, EI EI
 * @version 1.0.0
 * @since 1.0
 */
public class FunApp {

	// private static String number;
	public static void main(String[] args) {
		// number = app.requestLong();
		// System.out.println("the number is " + c);
		long number = AppBasics.requestLong("What is an example of a long number?");
		System.out.println("Response: " + number);
	}
}
