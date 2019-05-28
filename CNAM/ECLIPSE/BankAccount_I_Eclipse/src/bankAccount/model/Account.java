package bankAccount.model;

import bankAccount.exceptions.OverdraftException;

public class Account {

	/**Create an instance of Account class.
	 * @param name
	 */
	public Account(String name)
	{
		this.setName(name);
	}
	/**The name.
	 * 
	 */
	private String _name;
	
	private double _balance; 
	
	/**Get the name.
	 * @return
	 */
	public String getName()
	{
		return this._name;
	}
	
	/**Set the name.
	 * @param name
	 */
	public void setName(String name)
	{
		this._name = name;
	}
	
	/**Get the balance.
	 * @return
	 */
	public double getBalance()
	{
		return this._balance;
	}
	
	/**Set the balance.
	 * @param balance
	 */
	public void setBalance(double balance)
	{
		this._balance  = balance;
	}
	
	/**Make a deposit.
	 * @param deposit
	 */
	public void Deposit(double deposit)
	{
		System.out.println();
		System.out.println(
				"\t\t+|\t--\t--\t--\t--\t-+\n"
		+		"\t\t||\t\t -Deposit-\t\t||");
		System.out.println("\t\t||\t\t "+deposit+" "+" "+" " +"\t\t||" );
		System.out.println("\t\t+|\t--\t--\t--\t--\t-+\n");
		this._balance += deposit;
	}
	
	/**Make a withdrawal.
	 * @param withdrawal
	 */
	public void Withdrawal(double withdrawal)throws OverdraftException
	{
		System.out.println();
		System.out.println("\t\t+|\t--\t--\t--\t--\t-+\n"+"\t\t||\t\t -Withdrawal-\t\t||");
		System.out.println("\t\t||\t\t "+withdrawal+" "+" "+" " +" "+"\t\t||");
		System.out.println("\t\t+|\t--\t--\t--\t--\t-+\n");
		if(this._balance - withdrawal < 0)
		{
			throw new OverdraftException(withdrawal, this);
		}
		else
		{
			this._balance -= withdrawal;
		}
		
	}
	
	/**Display informations.
	 * 
	 */
	public void Display()
	{
		if(this.getName().length()<10)
		{
			System.out.println(
					"\t\t+|\t--\t--\t--\t--\t-+\n"+
					"\t\t||\t\t BANK ACOUNT \t\t||" + "\n" +
					"\t\t||\t Name : " + this.getName() + " "+" "+"\t\t||\n" +
					"\t\t||\t Balance : " + this.getBalance() + " "+" "+"\t\t||\n" +
					"\t\t+|\t--\t--\t--\t--\t-+");
		}
		else
		{
			System.out.println(
					"\t\t+|\t--\t--\t--\t--\t-+\n"+
					"\t\t||\t\t BANK ACOUNT \t\t||" + "\n" +
					"\t\t||\t Name : " + this.getName() + " "+" "+"\t||\n" +
					"\t\t||\t Balance : " + this.getBalance() + " "+" "+"\t\t||\n" +
					"\t\t+|\t--\t--\t--\t--\t-+");
		}
		
		System.out.println();
	}
	
	public Account Transfer(Account account, double value)throws OverdraftException
	{
		String val = Double.toString(value);
	
		if(val.length()<=5)
		{
			System.out.println();
			System.out.println("\t\t+|\t--\t--\t--\t--\t-+\n"+"\t\t||\t\t -Transfer-\t\t||");
			System.out.println("\t\t||\t\t " + value + " "+" "+ "\t\t\t||");
			System.out.println("\t\t||\tFrom " + this.getName()+" to " + account.getName());
			System.out.println("\t\t+|\t--\t--\t--\t--\t-+\n");
		}
		else
		{
			System.out.println();
			System.out.println("\t+|\t--\t--\t--\t--\t-+\n"+"||\t\t -Transfer-\t\t||");
			System.out.println("\t||\t\t " + value + " "+" "+ "\t\t||");
			System.out.println("\t\t||\tFrom " + this.getName()+" to " + account.getName());
			System.out.println("\t\t+|\t--\t--\t--\t--\t-+\n");
		}
				
		this.Withdrawal(value);
		account.Deposit(value);
		return account;
		
	}
}
