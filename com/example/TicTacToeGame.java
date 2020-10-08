package com.example;

public class TicTacToeGame {
	
	public static void main(String[] args) {
		System.out.println("Check if won: " +isWinner(board,userLetter));
	}
	
	
	private static boolean isWinner(char[] b, char ch) {
		return((b[1] == ch && b[2] == ch && b[3] == ch) || //across the top
			(b[4] == ch && b[5] == ch && b[6] == ch) || //across the middle
			(b[7] == ch && b[8] == ch && b[9] == ch) || //across the bottom
			(b[1] == ch && b[4] == ch && b[7] == ch) || //across the left
			(b[2] == ch && b[5] == ch && b[8] == ch) || //across the middle
			(b[3] == ch && b[6] == ch && b[9] == ch) || //across the right
			(b[1] == ch && b[5] == ch && b[9] == ch) || //across the leading diagonal
			(b[3] == ch && b[5] == ch && b[7] == ch) );	//across the other diagonal
		}
	}
		
	

