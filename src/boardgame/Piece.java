package boardgame;

public class Piece {
	
	//Variables
	protected Position position;
	protected Board board;
	
	//Constructor using Fields
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Create only protected getBoard
	protected Board getBoard() {
		return board;
	}
	
	
	
	

}
