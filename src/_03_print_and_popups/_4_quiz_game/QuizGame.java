package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	int count = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

				// 2.  Ask the user a question 
	String Q1 = JOptionPane.showInputDialog("what is the formula to find out the circonference of a circle");	
				// 3.  Use an if statement to check if their answer is correct
				if (Q1.equals("π*r*2")) {									
				// 4.  if the user's answer was correct, add one to their score 
			count = count+1;	}
				else { 		{ JOptionPane.showMessageDialog(null,"pls reastart and try again tomarrow");
			count = count-1;
			}
				}
				
				
				String Q2 = JOptionPane.showInputDialog("what is the formula to find out the circonference of a circle");	
				// 3.  Use an if statement to check if their answer is correct
				if (Q2.equals("π*r*2")) {									
				// 4.  if the user's answer was correct, add one to their score 
			count = count+1;	}
				else { 		{ JOptionPane.showMessageDialog(null,"pls reastart and try again tomarrow");
			count = count-1;
			}
				}String Q3 = JOptionPane.showInputDialog("what is the formula to find out the circonference of a circle");	
				// 3.  Use an if statement to check if their answer is correct
				if (Q3.equals("π*r*2")) {									
				// 4.  if the user's answer was correct, add one to their score 
			count = count+1;	}
				else { 		{ JOptionPane.showMessageDialog(null,"pls reastart and try again tomarrow");
			count = count-1;
			}
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				// 2.  Ask the user a question 
			
		
	}
}
