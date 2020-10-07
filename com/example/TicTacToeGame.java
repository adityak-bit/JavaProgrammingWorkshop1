package com.example;

import java.util.Scanner;

public class TicTacToeGame {
	char[] board = new char[10];
	private static char move;
	private Scanner sc;
	private int index;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		TicTacToeGame object = new TicTacToeGame();
		System.out.println("Choose your move index");
		object.userMove();
		object.showBoard(move);
	}
	
	public void showBoard(char c) {
		
		for (int i = 1; i < board.length; i = i + 3) {
			board[index] =c;
			System.out.println("------------------");
			System.out.println(board[i] + "\t" + board[i + 1] + "\t" + board[i + 2]+ "\n");
		}
	}
	
	public void userMove() {
		sc = new Scanner(System.in);
		int index = sc.nextInt();
		if(board[index] != 'X' && board[index] != 'O') {
			board[index] = 'O';
		    move = board[index];
		}
		else
			System.out.println("Index not free");
	}
}
