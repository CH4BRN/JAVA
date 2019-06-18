package apiculture.abeille;

import apiculture.ruche.CelluleMale;
import apiculture.ruche.CelluleOuvriere;
import apiculture.ruche.CelluleRoyale;
import apiculture.ruche.Node;
/** 
Visiteur abstrait
**/

public abstract class Abeille {
    
    protected String name;
    
    public Abeille(String name){ this.name = name; }
    
    public String getName(){ return name; }
    
    abstract public void visit(CelluleMale m);
    abstract public void visit(CelluleOuvriere o);
    abstract public void visit(CelluleRoyale r);
    
}
