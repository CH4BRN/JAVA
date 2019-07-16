package memento.adapter;

import memento.model.IMementoEntity;
import memento.model.IStateEntity;
import memento.model.Memento;
import memento.model.Originator;
import memento.observer.Observable;

public class ObservableAdapter extends Observable implements IStateEntity, IMementoEntity{
	
	public ObservableAdapter(Originator ori)
	{
		this.ori = ori;
	}
	
	public Originator ori;

	@Override
	public void setState(String state) {
		// TODO Auto-generated method stub
		this.Notify(state);
		this.ori.setState(state);
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return this.ori.getState();
	}

	@Override
	public void RestoreMemento(Memento m) {
		// TODO Auto-generated method stub
		this.ori.RestoreMemento(m);
	}

	
}
