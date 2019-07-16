package newThings.entities;

import newThings.contracts.IFlying;

public class Plane implements IFlying {

	@Override
	public void fly() {
		System.out.print("\n " + this.getClass().getSimpleName() + " is flying");
		
	}

}
