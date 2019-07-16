package memento.model;

public class Memento {
	
	public String savedState;
	
	public String getSavedState()
	{
		return savedState;
	}
	
	 public Memento(String stateToSave) {
         savedState = stateToSave;
     }

}
