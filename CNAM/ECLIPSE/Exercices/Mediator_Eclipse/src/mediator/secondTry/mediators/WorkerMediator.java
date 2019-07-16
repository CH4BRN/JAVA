package mediator.secondTry.mediators;

import mediator.secondTry.contracts.IWorker;

public class WorkerMediator {
	
	public static void mediate(IWorker w)
	{
		System.out.print("mediate "  + w.getClass().getSimpleName());
	}

}
