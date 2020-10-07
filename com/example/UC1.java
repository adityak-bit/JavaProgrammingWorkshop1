package com.example;

import java.util.Random;

public class UC1 {

	char[] board = new char[10];
	int i;

	public void board() {
		for (int i = 0; i < board.length; i++) {
			board[i] = '0';
			System.out.println(board[i]);
		}
	}

	public void playerInput() {
		Random random = new Random();
		for (int i = 0; i < board.length; i++) {
			int option = 1 + random.nextInt(2);
			switch (option) {
			case 1:
				board[i] = 'X';
				break;
			case 2:
				board[i] = 'O';
				break;
			default:
				break;
			}
			System.out.println("value at i "+i+" = "+board[i]);
		}	
	}
}
