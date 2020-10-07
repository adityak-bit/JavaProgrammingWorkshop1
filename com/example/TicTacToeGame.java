package com.example;

public class TicTacToeGame {
	public static final int HEAD = 0;
	public static final int TAIL = 1;

	public static enum Player {
		USER, COMPUTER
	};

	public static void main(String[] args) {
		Player player = getWhoStartsFirst();
	}

	/* UC6 */
	private static Player getWhoStartsFirst() {
		int toss = (int) (Math.random() * 10) % 2;
		return (toss == HEAD) ? Player.USER : Player.COMPUTER;
	}
}
