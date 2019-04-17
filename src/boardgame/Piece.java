package boardgame;

public abstract class Piece {
	
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
	
	//Method to check the possible moves of a piece
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMoves() {
	  boolean mat[][] = possibleMoves();
	  for(int i = 0; i<mat.length; i++) {
		  for (int j = 0; j<mat.length; j++){
			  if(mat[i][j]) {
				  return true;
			  }
			  
		  }
	  }
	  
	  return false;
	}
	

}
