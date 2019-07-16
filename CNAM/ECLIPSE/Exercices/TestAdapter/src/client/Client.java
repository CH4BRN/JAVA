package client;

import java.util.ArrayList;
import java.util.List;

import abstractFactory.Factory;
import abstractFactory.IAbstractFactory;
import adapter.FlyingAdapter;
import newThings.contracts.IFlying;
import newThings.entities.Plane;
import old.contracts.IMotorized;
import old.entities.Car;

public class Client {
	
	public void test()
	{
		IMotorized car = new Car("blue",4);
		IFlying plane = new Plane();
		
		car.Action();
		
		IAbstractFactory factory = new Factory();
		
		IMotorized adapter = factory.CreateMotorizedPlane();
		
		adapter.Action();
		
		List<IMotorized> list = new ArrayList<IMotorized>();
		
		list.add(adapter);
		list.add(car);
		
		for (IMotorized iMotorized : list) {
			iMotorized.Action();
		}
		
				
	}

}
