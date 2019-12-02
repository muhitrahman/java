

import javax.swing.JFrame;

public class fanlinetest {
	
	public static void main (String[]args) {
		
		fanline application = new fanline();//create a panel that contain our drawing 
		JFrame panel = new JFrame();//create a new frame to hold the panel
		
		//panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set the frame to exit when close
		
		panel.add(application);//add the panle to the frame 
		panel.setSize(600, 600);//set the size of the frame 
		panel.setVisible(true);//make the frame visible
	}

}
