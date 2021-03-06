import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Karilys Collazo");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(200, 200);
		myFrame.setSize(200, 200);
		
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int center_a = (int) ((dimension.getWidth() - myFrame.getWidth()) / 2);
        int center_b = (int) ((dimension.getHeight() - myFrame.getHeight()) / 2);
        myFrame.setLocation(center_a, center_b);
        
	}
}