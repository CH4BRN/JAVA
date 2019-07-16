package abstractFactory;

import adapter.FlyingAdapter;
import newThings.entities.Plane;
import old.contracts.IMotorized;

public interface IAbstractFactory {

	public IMotorized CreateMotorizedPlane();
}
