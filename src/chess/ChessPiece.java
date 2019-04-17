package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

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
	
	//Method to verify if in the position is an opponent piece or not
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != null;
	}

}
