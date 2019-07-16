package mediator.firstTry;

import java.text.SimpleDateFormat;

import mediator.firstTry.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User robert = new User("Robert");
	    User john = new User("John");
	        
	    //1. 
	    // An user send a message, let's go to "User" class to see "sendMessage"
	        robert.sendMessage(john, "Hi John");
	        
	        john.sendMessage(robert, "Hello Robert");
	        robert.sendMessage(john, "What's up ?");
	        john.sendMessage(robert, "Nothing special");
	}
	


	

	

}
