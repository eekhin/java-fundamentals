/**
 * File Name: AppBasics.java<br>
 * KHIN, EI EI<br>
 * Created: Aug 19, 2017
 */
package com.sqa.eiei.helpers;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author KHIN, EI EI
 * @version 1.0.0
 * @since 1.0
 */
import java.util.*;;

public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String userName) {
		System.out.println("Thank you " + userName + " for using our application.");
		System.out.println("Have a nice day");
	}

	public static String greetUserAndGetName(String appName) {
		// Greet the user using a system out call
		System.out.println("Welcome to the " + appName + " Application.");
		// Ask the user for their name and store in a local scope String
		// variable
		System.out.print("Can I get your name?");
		return scanner.nextLine();
	}

	// public static int requestInt(String question)
	// {
	// int num = 0; // double num =0.0;
	// String input;
	// System.out.print(question + "");
	// input = scanner.nextLine();
	// try {
	// num = Integer.parseInt(input); // num = Double.pareseDouble(input);
	// } catch (NumberFormatException e) {
	// System.out.println("You did not supply a valid number [" + input +
	// "].please provide only digits.");
	// }
	// return num;
	// }
	public static double requestDouble(String question) {
		double num = 0.0; // int num = 0;
		String input;
		System.out.print(question + "");
		input = scanner.nextLine();
		try {
			num = Double.parseDouble(input); // num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "].please provide only digits.");
		}
		return num;
	}

	public static float requestFloat(String question) {
		float num; // int num = 0;
		String input;
		System.out.print(question + "");
		input = scanner.nextLine();
		try {
			num = Float.parseFloat(input); // num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "].please provide only digits.");
		}
		return num;
	}

	public static long requestLong(String question) {
		long num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Long.parseLong(input); // num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You dsid not supply a valid number [" + input + "].please provide only digits.");
		}
		return num;
	}

	public static short requestShort(String question) {
		short num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Short.parseShort(input); // num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You dsid not supply a valid number [" + input + "].please provide only digits.");
		}
		return num;
	}

	public static Boolean requestBoolean(String question) {
		Boolean num = true;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Boolean.parseBoolean(input); // num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You dsid not supply a valid number [" + input + "].please provide only digits.");
		}
		return num;
	}

	public static char requestChar(String question) {
		char num;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		// try {
		// num = ; // num = Integer.parseInt(input);
		// } catch (NumberFormatException e) {
		System.out.println("You dsid not supply a valid number [" + input + "].please provide only digits.");
	}return num;

	}

	public static String requestString(String question) {
		System.out.print(question + "");
		return scanner.nextLine();
	}
	// public static requestLong(String question)
	// {
	// long a = 3075;
	// long b = -1000;
	//
	// long c = a+b;
	// System.out.println(question + " ");
	// return c;
	//
	// }
	// public static requestShort(String question)
	// {
	// short num = 0;
	// System.out.println(question + "");
	// return num;
	// }
	//
	// public static double requestBoolean(String question) {
	// boolean a = true;
	// System.out.println(question + "");
	// return num;
	// }
	//
	// public static double requestChar(String question) {
	// char name;
	// System.out.println(question + "");
	// return name;
	// }
}