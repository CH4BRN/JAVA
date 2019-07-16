package testObserver.api;

import testObserver.domain.aggregates.entities.computer;
import testObserver.domain.aggregates.entities.technician;

public class Client {
	
	public static void main(String[] args)
	{
		//New observable
		computer o = new computer("Pc_001");
		//Attach observer
		o.attach(new technician("George"));
		o.attach(new technician("Miranda"));
		o.attach(new technician("Samuel"));
		//Action
		o.display();
		
	}

}
