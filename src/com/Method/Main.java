package com.Method;

public class Main {

	public static void main(String[] args) {
		
		calculate(5000, 5, true, 100);	
		calculate(50, 5, true, 50);	

	}
	
	public static void calculate(int firstNumber, int levelCompleted, boolean gameOver, int bonus){
		
				
		if (gameOver == true) { //variable inside a code block cannot be used outside the code block
			int finalScore = firstNumber + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		} //variable outside code block can be used anywhere
		
	}

}
