package bankAccountTests;

import bankAccount.model.Account;

public class AccountTest1 {

	public static void main(String[] args) {
		//Constructor
				Print("Constructor");
				Account account1 = new Account("myAccount");
				account1.Display();
				Account account2 = new Account("mySecondACcount");
				account2.Display();
				
				//Deposit
				try {
					account1.Deposit(500);
					account1.Display();
					account2.Deposit(1000);
					account2.Display();
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
				//Withdrawal
				try {
					account2.Withdrawal(10);
					account2.Display();					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				
				//Transfer	
				try {
					account1.Display();
					account1.Transfer(account2, 75);
					account1.Display();
					account2.Display();
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			private static void Print(String message)
			{
				System.out.println(message);
			}
		// TODO Auto-generated method stub

	

}
