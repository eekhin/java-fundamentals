/**
 * File Name: FunApp.java<br>
 * KHIN, EI EI<br>
 * Created: Aug 21, 2017
 */
package com.sqa.eiei;

import com.sqa.eiei.helpers.*;

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

	// number = app.requestLong();
	// System.out.println("the number is " + c);
	long number = AppBasics.requestLong("What is an example of a long number?");

	// System.out.println("Response: " + number);
	short number1 = AppBasics.requestShort("What is the Short number");

	// System.out.println("Response: " + number1);
	float number2 = AppBasics.requestFloat("What is Float number");

	// System.out.println("Response: " + number2);
	boolean number3 = AppBasics.requestBoolean("What is Boolean number");
	// System.out.println("Response: " + number3);
}
