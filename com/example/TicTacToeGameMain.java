package com.example;

import java.util.Scanner;

public class TicTacToeGameMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
	}
	
	private static char chooseUserLetter(Scanner userInput) {
		System.out.println("choose your letter: ");
		return userInput.next().toUpperCase().charAt(0);
	}
}
