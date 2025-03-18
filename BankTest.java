public class BankTest{
	public static void main(String[] args)
	{
		BankAccount ba = new BankAccount();
		
		ba.deposit(1000);
		ba.deposit(10000);
		System.out.println("存款成功！您的餘額為"+ba.getBalance());
		
		ba.withdraw(9000);
		System.out.println("取款成功！您的餘額為"+ba.getBalance());
		
	}
}