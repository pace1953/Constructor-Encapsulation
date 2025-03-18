public class BankAccount{
	private int accountNumber = 0;
	private double balance = 0;
	private String owner = "";
	
	public BankAccount(int accountNumber, int balance, String owner){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.owner = owner;
	}
	
	public BankAccount() {
    this(0, 0, "");
	}
	
	public void deposit(double amount)
	{
		if ( amount > 0){
			this.balance += amount;
			System.out.println("存入"+amount+"元");
		}else {System.out.println("存入金額必須大於0");}
	}
	public void withdraw(double amount)
	{
		if ( amount <= 0){
			System.out.println("取款金額必須大於0");
		}else if(amount > this.balance){
			System.out.println("餘額不足");
		} else {
			this.balance -= amount;
			System.out.println("您已取出"+amount+"元");}
	}
	
	public double getBalance()
	{
		return this.balance;
	}

}