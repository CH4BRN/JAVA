package mediator.firstTry.contracts;

import mediator.firstTry.concretes.User;

public interface IUser {

	public void sendMessage(User dest, String msg);
	
	public void recieveMessage(String msg);
	
	public String getName() ;
}
