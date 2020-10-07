package com.example;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		/*
		 * Scanner userInput = new Scanner(System.in); char userLetter =
		 * chooseUserLetter(userInput); char computerLetter = (userLetter == 'X') ? 'O'
		 * : 'X';
		 */
		TicTacToeGame object = new TicTacToeGame();
		object.showBoard();
	}

	/*
	 * private static char chooseUserLetter(Scanner userInput) {
	 * System.out.println("choose your letter: "); return
	 * userInput.next().toUpperCase().charAt(0); }
	 */

	public void showBoard() {
		char[] board = new char[10];
		for (int i = 1; i < board.length; i = i + 3) {
			System.out.println("----------------");
			System.out.println(board[i] + "\t" + board[i + 1] + "\t" + board[i + 2] + "\n");
		}
	}
}
