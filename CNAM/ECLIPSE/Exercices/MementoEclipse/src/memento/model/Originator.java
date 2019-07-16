package memento.model;

import memento.observer.Observable;

public class Originator implements IStateEntity, IMementoEntity {
	
	
	
	private String state;
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getState()
	{
		return this.state;
	}
	public void RestoreMemento(Memento m)
	{
		this.state = m.savedState;
	}

}
