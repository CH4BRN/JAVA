package brebis.observables;

import brebis.contracts.AObservable;

public class Camera extends AObservable{
private String name;
    
    private String message;
    
    public Camera(String name){
        this.name = name;
    }
    
    public String getMessage(){
        return message;
    }
    
    public void detecte(String message){
    	this.message = message;
    	this.notifyObservers();
        
    }
    
    public String toString(){ return name; }

	@Override
	public Object getArguments() {
		// TODO Auto-generated method stub
		return this.message;
	}
}
