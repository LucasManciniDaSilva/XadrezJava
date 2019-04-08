package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	//Method to define the size of the board
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//Method to return a matrix of chess pieces
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece [board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				
			}
		}
		return mat;	
		
	}
}
