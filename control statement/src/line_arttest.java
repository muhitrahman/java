

import javax.swing.JFrame;
public class line_arttest {
	public static void main (String[]args) {
		line_art application = new line_art();//create a panel that contain our drawing 
		JFrame panel = new JFrame();//create a new frame to hold the panel
		panel.add(application);//add the panle to the frame 
		panel.setSize(300, 300);//set the size of the frame 
		panel.setVisible(true);//make the frame visible
	}
}
