package mediator.secondTry.contracts;

import mediator.secondTry.mediators.WorkerMediator;

public abstract class AWorker implements IWorker {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		WorkerMediator.mediate(this);
	}
	


}
