package dessin.contracts;

import java.awt.Graphics;

public class AComponent {

	public IComponent component;
	
	public void draw(Graphics g)
	{
		component.draw(g);
		this.draw(g);
		
	}
}
