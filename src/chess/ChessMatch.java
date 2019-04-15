package chess;

import boardgame.Board;
import boardgame.Position;
import chessPiece.King;
import chessPiece.Rock;

public class ChessMatch {

	private Board board;
	
	//Method to define the size of the board
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	//Method to return a matrix of chess pieces
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece [board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
             mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;	
		
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//Start the Chess Match
	private void initialSetup() {
		placeNewPiece('b', 6, new Rock(board, Color.WHITE));
		placeNewPiece('c', 1, new Rock(board, Color.WHITE));
        placeNewPiece('c', 2, new Rock(board, Color.WHITE));
        placeNewPiece('d', 2, new Rock(board, Color.WHITE));
        placeNewPiece('e', 2, new Rock(board, Color.WHITE));
        placeNewPiece('e', 1, new Rock(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rock(board, Color.BLACK));
        placeNewPiece('c', 8, new Rock(board, Color.BLACK));
        placeNewPiece('d', 7, new Rock(board, Color.BLACK));
        placeNewPiece('e', 7, new Rock(board, Color.BLACK));
        placeNewPiece('e', 8, new Rock(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}

