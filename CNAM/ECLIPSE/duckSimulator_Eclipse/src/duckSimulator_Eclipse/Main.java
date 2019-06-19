package duckSimulator_Eclipse;

import duckSimulator_Eclipse.Simulators.CompositeSimulator;
import duckSimulator_Eclipse.Simulators.FactorySimulator;
import duckSimulator_Eclipse.Simulators.GooseSimulator;
import duckSimulator_Eclipse.client.Client;
import old.DuckSimulator;

public class Main {

	public static void main(String[] args) {

/*
		Client client1 = new Client(new DuckSimulator());
		client1.simulate(0);
		client1.simulate(1);
		
		Client gooseClient = new Client(new GooseSimulator());	
		gooseClient.simulate(0);
		gooseClient.simulate(1);
		
		Client factoryClient = new Client(new FactorySimulator());
		factoryClient.simulate(0);
		factoryClient.simulate(1);
	*/	
		Client compositeClient = new Client(new CompositeSimulator());
		compositeClient.simulate(0);
		compositeClient.simulate(1);
		
		
		
	
	}
	
	

}
