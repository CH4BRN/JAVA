package old;

public abstract class AbstractScrollBar{
	 @Override public String toString(){ return this.getClass().getName(); }
	 public abstract AbstractScrollBar clone();	
}