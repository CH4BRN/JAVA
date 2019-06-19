package duck_Eclipse.contracts;

import java.util.List;

public abstract class AObservable implements IQuackable {
	public void Attach(IObserver o) {
		list.add(o);
	};
	public void Notify() {
		for (IObserver iObserver : list) {
			iObserver.update();
		}
	};
	
	public List<IObserver> list;
	
	

}
