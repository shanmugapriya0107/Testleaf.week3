package week3.day1.assignments_Bank_Override;

public class AxisBank extends BankInfo{

	@Override
	public int deposit() {
		return 300000;
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		System.out.println("Verify if the money is saved or no " +bank.savings());
		System.out.println("The fixed amount is " +bank.fixed());
		System.out.println("The deposit amount is " +bank.deposit());


	}

}
