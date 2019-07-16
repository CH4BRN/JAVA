package mediator.firstTry.model.mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

import mediator.firstTry.contracts.IUser;

public class ChatMediator {
	//3. 
	// The chat mediator does some operations, and call the receiver's "receiveMessage" method
    public static void showMessage(IUser from, IUser to, String msg){
        String isoDate = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm").format(new Date());
        String transmittedMsg = isoDate + "  [from " + from.getName() + "]\t: " + msg;
        to.recieveMessage(transmittedMsg);
    }
}