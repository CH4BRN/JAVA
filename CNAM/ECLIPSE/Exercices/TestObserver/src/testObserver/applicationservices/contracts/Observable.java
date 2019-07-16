package testObserver.applicationservices.contracts;

import java.util.ArrayList;
import java.util.List;

/** Abstract subject
 * @author pierre.antoine
 *
 */
public class Observable {
	public void attach(Observer o) {
		observers.add(o);
	};
	
	public void Notify() {
		for (Observer observer : observers) {
			System.out.println(observer.update(this) + " _ "+ this.getClass().getSimpleName());
			
		}
	};
	
	public List<Observer> observers = new ArrayList<Observer>();

}
