public class TestBankAccount {
	public static void main(String[] args)
	{
		BankAccount bank1 = new BankAccount();
		bank1.balance= 100;
		bank1.deposit(20);
		System.out.println(bank1.balance);
		bank1.withdraw(15);
		System.out.println(bank1.balance);
	}
}

	class BankAccount{
		double balance;

		public void deposit(double a){
			balance+=a;
		}
		public void withdraw(double a){
			balance-=a;
		}
	}
