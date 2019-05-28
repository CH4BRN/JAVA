package bankAccountTests;

import bankAccount.exceptions.OverdraftException;
import bankAccount.model.Account;

public class AccountTest2 {
	
	public static void main(String[] args)throws OverdraftException {
		setAccounts(new Account[10]);
		
		Account[] accounts = new Account[10];
		
		for(int i =0; i <10; i++)
		{
			accounts[i] = new Account("Account " + (i+1));
		}
		
		setAccounts(accounts);
		
		for(int i=0; i<getAccounts().length; i++)
		{
			getAccounts()[i].Deposit(200);
			getAccounts()[i].Display();
			int gain = i*100;
			getAccounts()[i].Deposit(gain);
			getAccounts()[i].Display();
		}
		
		for(int i =0; i<getAccounts().length; i++)
		{
			for(int j = i+1; j<getAccounts().length; j++)
			{
				getAccounts()[i].Transfer(getAccounts()[j], 20);
			}
		}
		
		System.out.print("\n\n\n");
		for(int i =0; i<getAccounts().length; i++)
		{
			getAccounts()[i].Display();
		}
		
		getAccounts()[0].Display();
		getAccounts()[0].Withdrawal(20);
		getAccounts()[0].Display();
		getAccounts()[0].Withdrawal(20);

	}

	private static Account[] _accounts;
	
	public static Account[] getAccounts()
	{
		return _accounts;
	}
	
	public static void setAccounts(Account[] accounts)
	{
		_accounts = accounts;
	}
	
	

}
