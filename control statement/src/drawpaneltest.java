


import javax.swing.JFrame;

public class drawpaneltest {
	
	public static void main (String[]args) {
		
		//create a panel that contain our drowing 
		drawpanel panel = new drawpanel();
		
		//create a new frame to hold the panle 
		JFrame application = new JFrame();
	
		//set the frame to exit when it is close
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);	//add the panel to the frame 
		application.setSize(500, 500);	// set the size of the frame 
		application.setVisible(true); 	// make the frame visible 
	}

}
