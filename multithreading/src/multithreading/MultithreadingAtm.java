package multithreading;
import java.io.*;
import java.util.*;
class CreateCustomerDetails implements Runnable 
{
	public void run()
	{
		CustomerDetails obj = new CustomerDetails();
		obj.setCustomerDetails(101, "praveen", 3530, 25000);
		
		CustomerDetails obj1 = new CustomerDetails();
		obj1.setCustomerDetails(102, "naveen", 3431, 25330);
		
		CustomerDetails obj2 = new CustomerDetails();
		obj2.setCustomerDetails(103, "adithyan", 3332, 25540);
		
		CustomerDetails obj3 = new CustomerDetails();
		obj3.setCustomerDetails(104, "elon", 3233, 25340);
		
		CustomerDetails obj4 = new CustomerDetails();
		obj4.setCustomerDetails(105, "musk", 3134, 25055);
		
		List<CustomerDetails> l = new ArrayList<CustomerDetails>();
		l.add(obj);
		l.add(obj1);
		l.add(obj2);
		l.add(obj3);
		l.add(obj4);
		
		
		System.out.println("Enter the account number...");
		Scanner in = new Scanner(System.in);
		int acc_no = in.nextInt();
		int flag = 0;
		for(int i=0; i<l.size(); i++)
		{
			if(l.get(i).getAccountNumber() == acc_no)
			{
				flag = 1;
				System.out.println("Enter the pin number..");
				int pin_no = in.nextInt();
				
				if(l.get(i).getPinNumber() != pin_no)
				{
					System.out.println("Incorrect Pin..");
				}
				else
				{
					System.out.println("Hai "+l.get(i).getAccountHolderName()+" Your Account Balance is: "+l.get(i).getAccountBalance());
				}
				
			}
		}
		if(flag == 0)
		{
			System.out.println("Your Account Number is not Registered");
		}
		
		
	}
}

class CreateAtmDetails implements Runnable
{
	public void run()
	{
		AtmDetails obj = new AtmDetails();
		obj.setAtmBalance(50, 40, 20);
		System.out.println("The total amount in atm is: "+obj.getTotal());
	}
}

public class MultithreadingAtm {

	public static void main(String args[]) throws InterruptedException
	{
		CreateCustomerDetails ccd = new CreateCustomerDetails();
		CreateAtmDetails cad = new CreateAtmDetails();
		
		Thread t1 = new Thread(ccd);
		Thread t2 = new Thread(cad);
		
		System.out.println("Press 1 if you are an account holder...");
		System.out.println("Press 2 if you are an atm organiser...");
		Scanner in = new Scanner(System.in);
		int temp = in.nextInt();
		
		if(temp == 1)
		{
			t1.start();
			t1.join();
		}
		else if(temp == 2)
		{
			t2.start();
			t2.join();
		}
		else
		{
			System.out.println("Invalid key pressed");
		}
		
		System.out.println("Thank You...");
		System.out.println("Visit Again...");
	}
}
