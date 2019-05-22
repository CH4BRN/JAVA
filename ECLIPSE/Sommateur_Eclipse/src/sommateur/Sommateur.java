package sommateur;

import java.util.ArrayList;
import java.util.List;

public class Sommateur {
	public static void main(String[] args) {
	    
        Component root = new Composite();
        Component node1_1 = new Composite();
        Component node1_1_1 = new Nombre(12);
        Component node1_1_2 = new Nombre(14);
        Component node1_2 = new Composite();
        Component node1_2_1 = new Nombre(5);
        Component node1_2_2 = new Composite();
        Component node1_2_2_1 = new Nombre(3);
        Component node1_2_2_2 = new Nombre(6);
        
        root.addChild(node1_1);
        node1_1.addChild(node1_1_1);
        node1_1.addChild(node1_1_2);
        root.addChild(node1_2);
        node1_2.addChild(node1_2_1);
        node1_2.addChild(node1_2_2);
        node1_2_2.addChild(node1_2_2_1);
        node1_2_2.addChild(node1_2_2_2);

        // à compléter
        System.out.println("Somme totale = " + root.somme());
        
        // à compléter
       
        System.out.println("Somme des enfants : ");
        
        for (Component leaf : ((Composite) root).getChildren()) {
        	System.out.println(leaf.getClass());
			System.out.println(leaf.somme());
		}
        
    }
}

abstract class Component {
    public abstract int somme();
    public abstract void addChild(Component c);
}

//Leaf
class Nombre extends Component{
	
	public Nombre (int value)
	{
		this.value = value;
	}

	public double value;
	
	@Override
	public int somme() {
		// TODO Auto-generated method stub
		return (int)value;
	}

	@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub
		
	}

}

//Composite
class Composite extends Component{
    
    private List<Component> children = new ArrayList<>();
    
    public int somme(){
    	double result = 0;
        for (Component component : children) {
			result += component.somme();
		}
        return (int) result;
    }
    
    // composite stuff
    public List<Component> getChildren(){
        return children;
    }
    public void addChild(Component child){
        children.add(child);
    }

}
