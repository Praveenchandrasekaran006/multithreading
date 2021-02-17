package multithreading;

public class AtmDetails {

	private int thousand_count;
	private int fivehundred_count;
	private int hundred_count;
	private int total;
	
	public void setAtmBalance(int hundred_count, int fivehundred_count, int thousand_count)
	{
		this.hundred_count = hundred_count;
		this.fivehundred_count = fivehundred_count;
		this.thousand_count = thousand_count;
		this.total = (hundred_count*100)+(fivehundred_count*500)+(thousand_count*1000);
		
	}
	
	public int getTotal()
	{
		return this.total;
	}
	
}
