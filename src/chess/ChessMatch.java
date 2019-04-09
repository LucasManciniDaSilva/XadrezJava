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
	
	//Start the Chess Match
	private void initialSetup() {
		board.placePiece(new Rock(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.WHITE), new Position(9, 4));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
	}
}
