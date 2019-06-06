package bibliotheque.contracts;

import java.util.ArrayList;
import java.util.List;

public interface IComposite 
{
	List<AComponent> children = new ArrayList<AComponent>();
	
	public List<AComponent> getChildren();
	
	public void addChild(AComponent child);
	
	public void print();
}
