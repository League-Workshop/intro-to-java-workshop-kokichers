package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	public static void main(String[] args) {
		
	ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the evil yet badly sighted dragon! It has brough much harm upon the nearby village.\nSo you, the unarmed fool who accidentally lead the dragon to everyone in the first place,\nhave been chosen to slay the beast and return with its riches to use for rennovations.", "Dragon Fighter", 0, dragon);
		int playerHealth = 100;
		int dragonHealth = 250;
		int playerDamage = 0;
		int dragonDamage = 0;
		
		while(playerHealth>0 && dragonHealth>0) {    

//player attack phase
		String attackChoice = JOptionPane.showInputDialog("Will you attack with dual punches or a swinging kick?");
		if(attackChoice.equals("dual punches")) {
			int randomNumP =new Random().nextInt(15)+1;
			dragonDamage = randomNumP;
			dragonHealth-=dragonDamage;
			JOptionPane.showMessageDialog(null,"You punch the dragon, dealing "+randomNumP+" damage.");
			int randomNumP2 =new Random().nextInt(15)+1;
			dragonDamage = randomNumP2;
			dragonHealth-=dragonDamage;
			JOptionPane.showMessageDialog(null,"You punch the dragon again, dealing "+randomNumP2+" damage.");
		}else if(attackChoice.equals("swinging kick")) {
			int randomNumK =new Random().nextInt(11)+15;
			dragonDamage = randomNumK;
			dragonHealth-=dragonDamage;
			JOptionPane.showMessageDialog(null,"You kick the dragon, dealing a total of "+randomNumK+" damage.");
		}
//player snatch phase
		int attemptChance =new Random().nextInt(4);
		if(attemptChance==3) {
		String itemChoice = JOptionPane.showInputDialog("Attempt to steal a tool from the dragon's hoard to aid yourself?");	
			if(itemChoice.contentEquals("yes")){
				int itemChance =new Random().nextInt(7);
				if(itemChance>=4) {
					if(itemChance==4) {
					
					}
					//4 = glowing sword, 3 = healing flask, 2 = rusted dagger, 2 = dragon's tail slams you away
				}else {
					JOptionPane.showMessageDialog(null,"You are unable to grab anything in time, and just barely dodge the dragon's counter attack.");
			}
			}else {
			JOptionPane.showMessageDialog(null,"You decide that would be too risky.");
			}
		}else {
		}
		
//dragon attack phase		
		int dragonAim =new Random().nextInt(2);
		if(dragonAim == 0) {
			JOptionPane.showMessageDialog(null,"The dragon swipes at you with its claws, and misses.");
		}else {
		int attackType =new Random().nextInt(10);
		if(attackType>=4) {	
			int randomNumC =new Random().nextInt(31)+20;
			playerDamage = randomNumC;
			playerHealth-=playerDamage;
			JOptionPane.showMessageDialog(null,"The dragon swipes at you with its claws, dealing a total of "+randomNumC+" damage.");
		}else {
			int randomNumF =new Random().nextInt(21)+5;
			playerDamage = randomNumF;
			playerHealth-=playerDamage;
			JOptionPane.showMessageDialog(null,"The dragon burns you with its flames, dealing "+randomNumF+" damage.");
			int randomNumF2 =new Random().nextInt(16)+5;
			playerDamage = randomNumF2;
			playerHealth-=playerDamage;
			JOptionPane.showMessageDialog(null,"As you're still on fire, you take "+randomNumF+" more damage.");
			int randomNumF3 =new Random().nextInt(5)+1;
			playerDamage = randomNumF3;
			playerHealth-=playerDamage;
			JOptionPane.showMessageDialog(null,"You're able to put out the flames, but not before taking another "+randomNumF+" units of damage.");
			}
		}
		
//summary
		if(playerHealth<=0) {
			JOptionPane.showMessageDialog(null,"Unfortunately, you have failed to defeat the dragon. You are dead.");	
		}else if(dragonHealth<=0) {
			JOptionPane.showMessageDialog(null,"Congratulations, you have successfully defeated the dragon and taken much of its gold! Maybe now the village will forgive you for your wrongdoings.");
		}else {
		    JOptionPane.showMessageDialog(null,"Current player health is "+playerHealth+" out of 100 while current dragon health is "+dragonHealth+" out of 250.");
				}
			}
		}
	}