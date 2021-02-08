package day8;

public class BankAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new SavingAccount();
		account1.MinimumBalancee(1000);
		Account account2=new CurrentAccount();
		account2.MinimumBalancee(2000);
		Account account3=new SalaryAccount();
		account3.MinimumBalancee(2000);
		

	}

}
