package week3.day1;

public class AxisBank {
	public void deposit() {
		System.out.println("deposit ");
	}
	public static void main(String[] args) {

		BankInfo bank = new BankInfo();
		bank.savings();
		bank.fixed();
		bank.deposit();

		AxisBank axis = new AxisBank();
		//  deposit method will be overriden
		axis.deposit();

	}
}
