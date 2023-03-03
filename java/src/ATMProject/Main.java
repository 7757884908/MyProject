package ATMProject;

import java.util.Scanner; //import scanner class

public class Main {
	public static void main(String[] args) {
		AtmOperationInterf op = new AtmOperationImpl(); // Interface Concept
		int atmnumber = 123456; // Assigning ATM number
		int atmpin = 1234; //// Assigning Pin number
		Scanner sc = new Scanner(System.in); // Scanner class object
		System.out.println("Welcome to ATM Machine !!!");
		System.out.print("Enter Atm Number : ");
		int atmNumber = sc.nextInt();
		System.out.print("Enter Pin: ");
		int pin = sc.nextInt();
		if ((atmnumber == atmNumber) && (atmpin == pin)) // Match The atm number and atm pin then only see the option
		{
			while (true) {
				System.out.println(
						"1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter Choice : ");
				int ch = sc.nextInt();
				if (ch == 1) { // switch statement
					op.viewBalance();

				} else if (ch == 2) {
					System.out.println("Enter amount to withdraw "); // nested if statement
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);

				} else if (ch == 3) {
					System.out.println("Enter Amount to Deposit :");
					double depositAmount = sc.nextDouble();// 5000
					op.depositAmount(depositAmount);

				} else if (ch == 4) {
					op.viewMiniStatement();

				} else if (ch == 5) {
					System.out.println("Collect your ATM Card\nThank you for using ATM Machine!!");
					System.exit(0);
				} else {
					System.out.println("Please enter correct choice");
				}
			}
		} else {
			System.out.println("Incorrect Atm Number or pin");
			System.exit(0);
		}

	}
}