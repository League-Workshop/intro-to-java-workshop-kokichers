package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a pihrana infested river, here's how you do it...");
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog(null,"Enter an adjective.");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog(null,"Enter a type of liquid."); 
		// Get the user to enter a body part
		String bodypart = JOptionPane.showInputDialog(null,"Enter an appendage."); 
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog(null,"Enter a verb."); 
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog(null,"Enter a location.");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null,"Piranhas are more "+adjective+" during the day, so cross the river at night.\nPiranhas are attracted to fresh "+liquid+" and will most likely take a bite out of your "+bodypart+" if you "+verb+".\nWhatever you do, if you have an open wound, try to find another way to get back to the "+place+".\nGood luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

