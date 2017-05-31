/**
 * Calculates Body Mass Index for the user
 */

package BodyMassIndex;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BodyMassIndex {
	public static void main(String[] args) {
		int height;
		int weight;

		Scanner console;
		console = new Scanner(System.in);

		System.out.print("How tall are you in centimeters?");
		height = console.nextInt();
		System.out.print("How much do you weigh in kilograms?");
		weight = console.nextInt();

		DecimalFormat dfWithTwoDecimalPlaces;
		dfWithTwoDecimalPlaces = new DecimalFormat("Body Mass Index = " + "0.00");
		System.out.print(dfWithTwoDecimalPlaces.format(weight / ((double) height / 100 * height / 100)));

	}

}
/*
How tall are you in centimeters?173
How much do you weigh in kilograms?68
Body Mass Index = 22.72
*/