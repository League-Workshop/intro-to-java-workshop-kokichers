package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String q1input = JOptionPane.showInputDialog("Of the two most commonly spotted lizard species in San Diego, which has males that can come in three different colors?\nHint: it is sometimes refered to as playing rock paper siccors due to how the colors affect male's strategies for finding mates are compatible with each other\nin the same way that rock, paper, and scissors are in the popular children's game 'Rock Paper Scissors'.");
		// 3.  Use an if statement to check if their answer is correct
		if(q1input.equals("side blotched lizard")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			// 4.  if the user's answer was correct, add one to their score 		
			score++;
		} else {
			JOptionPane.showMessageDialog(null,"Wrong. Go restudy all you know.");
				}
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 		
		String q2input = JOptionPane.showInputDialog("And what is the other species?");
		if(q2input.equals("western fence lizard")) {
			JOptionPane.showMessageDialog(null,"Correct!");		
			score++;
		} else {
			JOptionPane.showMessageDialog(null,"Wrong. Go restudy all you know.");
				}	
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"Your final score is "+score+" out of 2.");
	}
}
