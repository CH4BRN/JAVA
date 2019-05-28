package dame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Checkers extends JFrame implements MouseListener {
	// Damier. Trois valeurs possibles : 1 joeur blanc, 0 joueur noir, -1 case vide
	private int board [][];
	// Joueur actuel (1 ou 0)
	private int currentPlayer;
	//coordonnées du pion selectionné à la souris
	private int selectedPiece[];
	//barre de status pour afficher les messages
	private JLabel statusBar;
	
	/**
	 * Cette classe permet d'afficher le damier
	 */
	class BoardComponent extends JComponent {
		public BoardComponent () {
			setMinimumSize(new Dimension(80 * 8, 80 * 8));
			setPreferredSize(new Dimension(80*8, 80*8));
			setMaximumSize(new Dimension(80*8, 80*8));
		}
	
		@Override
		public void paint(Graphics g) 
		{
			for (int j = 0; j < 8; j++) 
			{
				for (int i = 0; i < 8; i++) 
				{
					if(((i+j)%2)==1) 
					{
						g.setColor(Color.WHITE);
					}
					else 
					{
						g.setColor(Color.BLACK);
					}
					g.fillRect(i*80,  j*80,  80, 80);
					int p = board[i][j];
					if(p >= 0) 
					{
						if((p%2)==0)
						{
							g.setColor(Color.BLACK);
						}
						else
						{
							g.setColor(Color.WHITE);
						}
						g.fillOval(i*80+5, j*80+5, 70, 70);
						g.setColor(Color.WHITE);
						g.drawOval(i*80+5, j*80+5, 70, 70);
					}
				}				
			}
		}
	}
	
	/**
	 * Constructeur
	 */
	public Checkers()
	{
		// Le joueur blanc commence
		currentPlayer = 0;
		// Le damier est initialisé avec des cases vides
		board = new int[8][8];
		for(int j =0; j<8; j++)
		{
			for(int i =0; i <8; i++)
			{
				board[i][j] = -1;
			}
		}
		// Placement initial des pions (blanc en haut, noir en bas)
		board[0][0] = board[2][0] = board[4][0] = board[6][0] = 0;
		board[1][1] = board[3][1] = board[5][1] = board[7][1] = 0;
		board[0][6] = board[2][6] = board[4][6] = board[6][6] = 1;
		board[1][7] = board[3][7] = board[5][7] = board[7][7] = 1;
		
		//Parametrage de la fenetre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Jeu de dames");
		setLayout(new BorderLayout());
		getContentPane().add(new BoardComponent(), BorderLayout.CENTER);
		statusBar = new JLabel("Current player");
		getContentPane().add(statusBar, BorderLayout.SOUTH);
		pack();
		redraw();
		
		addMouseListener(this);
		}
	
	public void redraw()
	{
		String msg = (currentPlayer ==0)?"Noir":"Blanc";
		statusBar.setText("Joueur actuel : " + msg);
		repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		//Coordonnées de la case sous le urseur
		int i = e.getX() /80;
		int j = e.getY() / 80;
		//si la case contient un pion du joueur actuel il est alors selectionné
		if(board[i][j] == currentPlayer) 
		{
			selectedPiece = new int[2];
			selectedPiece[0] = i;
			selectedPiece[1] = j;
		}
		//Sinon rien n'est selectionné
		else {
			selectedPiece = null;
		}
		
	}

	/** Méthode appelée lorsqu'un bouton de la souris est relaché */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(selectedPiece == null)
		{
			return;
		}
		//Coordonnées de la case sous le curseur
		int i = e.getX() /80;
		int j = e.getY()/80;
		//Les opérations suivantes s'assurent que le deplacement demandé est correct
		// Si c'est le cas elles le mettent en oeuvre
		if(board[i][j] < 0 && ((i+j)%2)==0)
		{
			boolean doMove = false;
			int i0 = selectedPiece[0];
			int j0 = selectedPiece[1];
			
			if((i==i0+1 && j==j0+1)
			||(i==i0+1 && j==j0-1)
			||(i==i0-1 && j==j0+1)
			||(i==i0-1 && j==j0-1))
			{
				doMove = true;
			}
		
		else if (i== i0+2 && j==j0+2 && board [i0+1][j0+1] == 1-board[i0][j0])
		{
			board[i0+1][j0+1] = -1;
			doMove = true;
		}
		else if (i== i0-2 && j==j0+2 && board [i0-1][j0+1] == 1-board[i0][j0])
		{
			board[i0-1][j0+1] = -1;
			doMove = true;
		}
		else if (i==i0+2 && j==j0-2 && board [i0+1][j0-1] == 1-board[i0][j0])
		{
			board[i0+1][j0-1] = -1;
			doMove = true;
		}
		else if (i==i0-2 && j==j0-2 && board [i0-1][j0-1] == 1-board[i0][j0])
		{
			board[i0-1][j0-1] = -1;
			doMove = true;
		}
		if(doMove)
		{
			board[i][j] = board[i0][j0];
			board[i0][j0] = -1;
			currentPlayer = 1-currentPlayer;
			redraw();
		}
		}
		selectedPiece = null;			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[] args) 
	{
		Checkers checkers = new Checkers();
		checkers.setLocationRelativeTo(null);
		checkers.setVisible(true);
	}
	
}
