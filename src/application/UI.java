package application;

import chess.ChessPiece;

public class UI {

	//Method to print the board on the screen
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i=0; i<pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
				}
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}
	
	
	//Method to print the pieces int the board
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
	
}
