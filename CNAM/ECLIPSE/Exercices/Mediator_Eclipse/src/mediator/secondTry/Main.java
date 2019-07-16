package mediator.secondTry;

import mediator.secondTry.concretes.Farmer;
import mediator.secondTry.concretes.Miner;
import mediator.secondTry.contracts.IWorker;

public class Main {

	public static void main(String[] args) {
		
		IWorker worker = new Miner();
		
		worker.work();
		
		IWorker worked = new Farmer();
		worked.work();
		// TODO Auto-generated method stub

	}

}
