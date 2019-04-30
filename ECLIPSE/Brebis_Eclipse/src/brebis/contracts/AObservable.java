package brebis.contracts;

import java.util.ArrayList;
import java.util.List;

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
