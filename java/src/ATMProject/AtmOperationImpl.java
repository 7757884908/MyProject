package ATMProject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {
	ATM atm = new ATM();
	Map<Double, String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() // 1st Operation
	{
		System.out.println("Available Balance is : " + atm.getBalance());

	}

	@Override
	public void withdrawAmount(double withdrawAmount) // 2nd Operation
	{
		if (withdrawAmount == withdrawAmount) {
			if (withdrawAmount <= atm.getBalance()) {
				ministmt.put(withdrawAmount, " Amount Withdrawn");
				System.out.println("Collect the Cash " + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);
				viewBalance();
			} else {
				System.out.println("Insufficient Balance !!");
			}
		} else {
			System.out.println("Please enter the amount in multipal of 100");
		}

	}

	@Override
	public void depositAmount(double depositAmount) // 3rd Operation Deposit Operation
	{
		ministmt.put(depositAmount, " Amount Deposited");
		System.out.println(depositAmount + " Deposited Successfully !!");
		atm.setBalance(atm.getBalance() + depositAmount);
		viewBalance();

	}

	@Override
	public void viewMiniStatement() // 4th Operation view the balance history
	{
		for (Map.Entry<Double, String> m : ministmt.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());
		}

	}
}