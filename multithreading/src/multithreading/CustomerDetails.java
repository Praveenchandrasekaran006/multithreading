package multithreading;

public class CustomerDetails {

	private int account_no;
	private String name;
	private int pin;
	private int acc_balance;
	 
	public void setCustomerDetails(int account_no, String name, int pin, int acc_balance)
	{
		this.account_no = account_no;
		this.name = name;
		this.pin = pin;
		this.acc_balance = acc_balance;
	}
	
	public int getAccountNumber()
	{
		return this.account_no;
	}
	public int getPinNumber()
	{
		return this.pin;
	}
	public String getAccountHolderName()
	{
		return this.name;
	}
	public int getAccountBalance()
	{
		return this.acc_balance;
	}
	
}
