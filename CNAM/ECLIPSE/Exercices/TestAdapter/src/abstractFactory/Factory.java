package abstractFactory;

import adapter.FlyingAdapter;
import newThings.entities.Plane;
import old.contracts.IMotorized;

public class Factory implements IAbstractFactory{

	@Override
	public IMotorized CreateMotorizedPlane() {
		// TODO Auto-generated method stub
		return new FlyingAdapter(new Plane());
	}
	

}
