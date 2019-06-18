package brebis.observers;

import java.util.HashMap;
import java.util.Map;

import brebis.contracts.IObserver;
import brebis.contracts.AObservable;

public class Paysan implements IObserver {

    private String name;
    
    private Map<String, Double> state = new HashMap<>();
    
    public Paysan(String name){
        this.name = name;
        
    }

	public void update(AObservable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " " +arg);
		
	}
    
}


