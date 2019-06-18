package bankAccount.exceptions;

import bankAccount.model.Account;

public class OverdraftException extends Exception{
public OverdraftException(double withdrawal, Account account) {
	super("Retrait de " + Double.toString(withdrawal) + " impossible sur " + account.getName());
	// TODO Auto-generated constructor stub
}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
