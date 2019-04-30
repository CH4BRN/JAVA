package brebis.observers;

import brebis.contracts.IObserver;
import brebis.contracts.AObservable;

public class Gendarme implements IObserver {
	   private String name;
	    
	    public Gendarme(String name){
	        this.name = name;
	    }

		@Override
		public void update(AObservable o, Object arg) {
			System.out.println(this.name + " " +arg);
			
		}

}
