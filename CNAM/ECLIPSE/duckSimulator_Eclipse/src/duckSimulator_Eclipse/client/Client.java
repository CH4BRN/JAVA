package duckSimulator_Eclipse.client;

import duckSimulator_Eclipse.Simulators.ASimulator;

public class Client {

	private ASimulator simulator;
	public Client(ASimulator simulator)
	{
		this.simulator = simulator;
	}
	
	public void simulate(int i)
	{
		this.simulator.simulation(i);
	}
}
