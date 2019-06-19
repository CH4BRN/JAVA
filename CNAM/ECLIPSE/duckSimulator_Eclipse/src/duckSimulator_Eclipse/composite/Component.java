package duckSimulator_Eclipse.composite;

import java.util.ArrayList;
import java.util.List;

import old.IQuackable;

public class Component  implements IQuackable{

	public List<Component> children = new ArrayList<Component>();
	
	public void add(Component component) {
		if(children == null)
		{
			children = new ArrayList<Component>();
		}
		children.add(component);
	};
	public void remove(Component component) {
		if(children.contains(component))
		{
			children.remove(component);
			
		}
	};
	public Component getChild(int i) {
		if(children.size() >= i)
		{
			return children.get(i);
		}
		return new Component();
		
	}
	@Override
	public void quack() {
		
		for (Component component : children) {
			component.quack();
		}
		
	};


}
