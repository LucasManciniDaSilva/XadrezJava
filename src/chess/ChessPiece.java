package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	//Variables
	private Color color;

	//Constructor using fields
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Generated only the getColor
	public Color getColor() {
		return color;
	}
	
	

}
