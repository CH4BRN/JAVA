package apiculture.abeille;

import apiculture.ruche.Node;

public abstract class Abeille {
    
    protected String name;
    
    public Abeille(String name){ this.name = name; }
    
    public String getName(){ return name; }
    
    abstract public void visit(Node n);
}
