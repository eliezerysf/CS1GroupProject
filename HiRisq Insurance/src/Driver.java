
/** deifnes a reusable driver class. One object store the age of the driver
 * another one his car value and the last one the number of tickets he has. 
 */

import java.util.Scanner;
/** asks to enter the age the car value and the number of tickets that 
 * the correspond to the driver 
 */
public class Driver {
	private int age;
	private int carValue;
	private int numberOfTickets;

	public void read() {

		Scanner console;
		console = new Scanner(System.in);
		System.out.println("Driver's age");
		age = console.nextInt();
		System.out.println("Number of Tickets");
		numberOfTickets = console.nextInt();
		System.out.println("value of car");
		carValue = console.nextInt();
	}
	/**
	 * defines the condition and the formula to calculates prenium according to
	 * the different conditions
	 */
	public double premium() {
		double premium;
		double page = 1, ptickets = 1;

		if (age < 25)
			page = 1.15;
		else if (age <= 29)
			page = 1.25;
		switch (numberOfTickets) {
		case 1:
			ptickets = 1.10;
		case 2:
			ptickets = 1.25;
		case 3:
			ptickets = 1.50;
		}
		premium = (((carValue * .05) * page) * ptickets);
		return premium;
	}
}
