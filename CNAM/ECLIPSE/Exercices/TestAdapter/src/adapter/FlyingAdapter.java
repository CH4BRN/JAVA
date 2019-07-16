package adapter;

import newThings.contracts.IFlying;
import old.contracts.IMotorized;

public class FlyingAdapter implements IMotorized {
	private IFlying plane;
	
	public FlyingAdapter(IFlying plane) {
		this.plane = plane;
	}
	@Override
	public void Action() {
		this.plane.fly();
		
	}

	
	

}
