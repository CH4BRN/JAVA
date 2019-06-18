package dessin.carres;

import java.awt.Color;
import java.awt.Graphics;

import dessin.contracts.AComponent;
import dessin.contracts.IComponent;

public class CarreSimple extends AComponent implements IComponent{

	public CarreSimple component;
	
	/** Couleur utilisée pour dessiner le carré **/
    private static Color color = Color.BLACK;
    
    /** Abcisse du centre, en pixels **/
    private int xc;
    
    /** Ordonnée du centre, en pixels **/
    private int yc;

    /** Taille d'un côté, en pixels **/
    private int cote;
    
    /** 
        Constructeur à partir des coordonnées du centre et de la longueur d'un côté
        @param xc Abcisse du centre, en pixel
        @param yc Ordonnée du centre, en pixels
        @param cote Taille d'un côté, en pixels
    **/
    public CarreSimple(int xc, int yc, int cote){
        this.xc = xc;
        this.yc = yc;
        this.cote = 100;
    }
    
    /** Renvoie l'abcisse du centre, en pixels. **/
    public int getXc() { return xc; }
    
    /** Renvoie l'ordonnée du centre, en pixels. **/
    public int getYc() { return yc; }
    
    /** Renvoie la longueur des côtés, en pixels. **/
    public int getCote() { return cote; }
    
    public void draw(Graphics g){
    	
        g.setColor(color);
        int xtopleft = getXc() - (int)(getCote() / 2.0);
        int ytopleft = getYc() - (int)(getCote() / 2.0);
        g.drawRect(xtopleft, ytopleft, getCote(), getCote());
        
        if(component != null)
        {
        	component.draw(g);
        }
     
    }
}
