package old;

public abstract class AbstractWindow{
	 @Override public String toString(){ return this.getClass().getName(); }


	 public abstract AbstractWindow clone();
}

