package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	
	//Variables
	private Color color;
	private int moveCount;
	

	//Constructor using fields
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Generated only the getColor
	public Color getColor() {
		return color;
	}
	
	public int getMoveCount()
	{
      return moveCount;
	}
	//Method to count the movements of a piece
		public void increaseMoveCount() {
			moveCount++;
		}
		
		public void decreaseMoveCount() {
			moveCount--;
		}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	//Method to verify if in the position is an opponent piece or not
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
