


import java.awt.Graphics;
import javax.swing.JPanel;
public class line_art extends JPanel {
 
	public void paintComponent (Graphics g) {
		super.paintComponent(g); 
		
		int width = getWidth(); 
		int heigth = getHeight();
		
		int startX = 0;
		int startY = 0;
		int endX = 0; 
		int endY = heigth;
						
		while ( startY < heigth )
		{
		    g.drawLine( startX, startY, endX, endY );
		    		    
		    startY += 15;
		    endX += 15;
		}
		
	}	
}





























