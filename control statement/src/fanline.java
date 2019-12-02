

import java.awt.Graphics;
import javax.swing.JPanel;

public class fanline extends JPanel{// class with extends jpanel
			
		@SuppressWarnings("unused")
		
		public void paintComponent(Graphics g) {//draw an X from the corner of the panel 
		super.paintComponent(g);//call paintcomponent to make sure display panels
			
			int width = getWidth();//total width 
			int heigth = getHeight();//total heigth
			
			int x, y; //create local variables
		
			int loopCount = 1;// initialize loop counter 
			int xCount = 1;//initialize X counter
			int yCount = 1;//initialize Y counter
			
			x = width/15; //determine the line numbers in rectengular JFrame box
			y = heigth/15;
					
			//g.drawLine(0, 0, 0, heigth);// lines fan out from top left corner 
			loopCount=xCount=yCount=1;
			while (loopCount < 15) {//start while
				g.drawLine(0, 0, (x * xCount), (heigth-y * yCount));//draw fanout multiple line from the left corner 
				++loopCount;
				++xCount;
				++yCount;
			}//end while
			
			loopCount=xCount=yCount=1;//line fan out from top right corner
			//g.drawLine(0, heigth, width, heigth);
			while (loopCount < 15) {
				g.drawLine(width, 0, (width-x * xCount), (heigth-y * yCount));
				++loopCount;
				++xCount;
				++yCount;
			}
			loopCount=xCount=yCount=1;//line fanout from bottom left corner 
			while (loopCount < 15) {
				g.drawLine(0, heigth, (width-x * xCount), (heigth-y * yCount));
				++loopCount;
				++xCount;
				++yCount;
			}
			loopCount=xCount=yCount=1;
			while (loopCount <15) {
				g.drawLine(width, heigth, (x * xCount), (heigth-y * yCount));
				++loopCount;
				++xCount;
				++yCount;
			}
			
	}//end method paintComponent
}


















