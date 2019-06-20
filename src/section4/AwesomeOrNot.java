package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int randomNum =new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(randomNum);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("Enter something you believe to be awesome.");
	// 5. If the random number is 0
if(randomNum==0) {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null,"Yea,,, that's pretty dang cool.");
	// 6. If the random number is 1
}else if(randomNum==1){
	// -- tell the user whatever they entered is ok.
	JOptionPane.showMessageDialog(null,"Ehhh that's okay.");
	// 7. If the random number is 2
}else if(randomNum==2){
	// -- tell the user whatever they entered is boring.
	JOptionPane.showMessageDialog(null,"That's boringgg wyd.");
	// 8. If the random number is 3
}else if(randomNum==3){
	// -- write your own answer
	JOptionPane.showMessageDialog(null,"Please tell me you're being ironic plea");
		}
	}
}


