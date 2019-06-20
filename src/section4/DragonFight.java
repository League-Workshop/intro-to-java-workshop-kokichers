package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
	ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the evil yet badly sighted dragon! It has brough much harm upon the nearby village.\nSo you, the unarmed fool who accidentally lead the dragon to everyone in the first place,\nhave been chosen to slay the beast and return with its riches to use for rennovations.", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player takes each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon takes does each round
		int dragonDamage = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).

		// 8. Ask the player in a pop-up if they want to attack the dragon with a dual punches or a swinging kick
		String attackChoice = JOptionPane.showInputDialog("Will you attack with dual punches or a swinging kick?");
		// 9. If they typed in "dual punches":
		if(attackChoice.equals("dual punches")) {
			//-- Find a random number between 1 and 15 and store it in dragonDamage
			int randomNumP =new Random().nextInt(15)+1;
			dragonDamage = randomNumP;
			//-- Subtract that number from the dragon's health variable 
			dragonHealth-=dragonDamage;
			JOptionPane.showMessageDialog(null,"You punch the dragon, dealing "+randomNumP+" damage.");
			//-- Do this again		
			int randomNumP2 =new Random().nextInt(15)+1;
			dragonDamage = randomNumP2;
			dragonHealth-=dragonDamage;
			JOptionPane.showMessageDialog(null,"You punch the dragon again, dealing "+randomNumP2+" damage.");
			// 10. If they typed in "swinging kick":
		}else if(attackChoice.equals("swinging kick")) {
			//-- Find a random number between 15 and 25 and store it in dragonDamage
			int randomNumK =new Random().nextInt(11)+15;
			dragonDamage = randomNumK;
			//-- Subtract that number from the dragon's health variable
			dragonHealth-=dragonDamage;
			JOptionPane.showMessageDialog(null,"You kick the dragon, dealing a total of "+randomNumK+" damage.");
		}
		// Makes a random number generator between just 0 and 1
		int dragonAim =new Random().nextInt(2);
		// If the variable is 0, have the dragon miss its attack and tell the player so
		if(dragonAim == 0) {
			JOptionPane.showMessageDialog(null,"The dragon swipes at you with its claws, and misses.");
		}else {
		// 11.  If the variable is 1, find a random number between 20 and 50 and store it in playerDamage
			int randomNumC =new Random().nextInt(31)+20;
			playerDamage = randomNumC;
			// 12. Subtract this number from the player's health
			playerHealth-=playerDamage;
			JOptionPane.showMessageDialog(null,"The dragon swipes at you with its claws, dealing a total of "+randomNumC+" damage.");
		// 13. If the user's health is less than or equal to 0
		if(playerHealth<=0) {
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null,"Unfortunately, you have failed to defeat the dragon. You are dead.");	
		// 14. Else if the dragon's health is less than or equal to 0
		}if(dragonHealth<=0) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null,"Congratulations, you have successfully defeated the dragon and taken much of its gold! Maybe now your family will forgive you for your wrongdoings.");
	    //  15.  Else
		}else {
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		    JOptionPane.showMessageDialog(null,"Current player health is "+playerHealth+" out of 100 while current dragon health is "+dragonHealth+" out of 100.");
				}
			}
		}
	}
}