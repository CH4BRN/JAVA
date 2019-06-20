package brebis.contracts;

import java.util.ArrayList;
import java.util.List;

/** It's the subject, it has Observers. Subject = Observable.
 * All the observers are notified when the subect's state changes.
 * @author pierre.antoine
 *
 */
public abstract class AObservable{
    
    /**Observers list
     * 
     */
    protected List<IObserver> observers = new ArrayList<IObserver>();
    
    /**Add an observer
     * @param o
     */
    public void addObserver(IObserver o){
        observers.add(o);
    }
    
    /**Notify the observer and "gives" him the data
     * 
     */
    public void notifyObservers(){
        for(IObserver o : observers){
            o.update(this, getArguments());
        }
    }
    
    public abstract Object getArguments();
    
}
