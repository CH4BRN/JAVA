package bridge.vehicle;

import bridge.gear.IGear;

public abstract class AVehicle implements IVehicle {

	public AVehicle(IGear gear)
	{
		this.gear = gear;
	}
	
	public void displayGear()
	{
		this.gear.display();
	}
	
	public IGear gear;
}
