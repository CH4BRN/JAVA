package mediator.firstTry.concretes;

import mediator.firstTry.contracts.IUser;
import mediator.firstTry.model.mediator.ChatMediator;

public class User implements IUser {
    private String name;
    public User(String name){ this.name  = name; }
    public String getName() { return name; }
    //2. 
    // Send message uses the ChatMediator's showMessage method, with :
    // - the sender
    // - the receiver
    // - the message
    // Let's go to ChatMediator to see ShowMessage
    public void sendMessage(User dest, String msg){
        ChatMediator.showMessage(this, dest, msg);
    }
    //4.
    // This method is called by the mediator
    public void recieveMessage(String msg){
        System.out.println(" CONSOLE DE " + name + " :\t" + msg);
    }
}
