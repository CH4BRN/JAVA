package bridge;

import java.util.ArrayList;

import bridge.gear.AutomaticGear;
import bridge.gear.ManualGear;
import bridge.vehicle.AVehicle;
import bridge.vehicle.Car;
import bridge.vehicle.Truck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AVehicle vehicle_1 = new Car(new AutomaticGear());
		AVehicle vehicle_2 = new Car(new ManualGear());
		AVehicle vehicle_3 = new Truck(new AutomaticGear());
		AVehicle vehicle_4 = new Truck(new ManualGear());
		
		ArrayList<AVehicle> list = new ArrayList<AVehicle>();
		
		list.add(vehicle_1);
		list.add(vehicle_2);
		list.add(vehicle_3);
		list.add(vehicle_4);
		
		for (AVehicle aVehicle : list) {
			aVehicle.displayGear();
		}
		
	}

}
