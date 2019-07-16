package old.entities;

import old.contracts.IMotorized;

public class Car implements IMotorized {
	public int doorlNb = 4;
	
	public String color = "grey";
	
	public Car(String color, int doorNb)
	{
		this.color = color;
		this.doorlNb = doorNb;
	}

	@Override
	public void Action() {
		System.out.print("\n"+this.getClass().getSimpleName() + " motor action");
		
	}

}
