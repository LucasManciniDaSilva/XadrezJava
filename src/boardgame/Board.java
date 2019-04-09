package boardgame;

public class Board {

	//Variables
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Constructor using Fields
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating  board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	//Method to return rows and columns
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not in the board");
		}
		return pieces[row][column];
	}
	
	//Method to return rows and columns from a position
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not in the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Method to put a piece on the board
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//Method to verify if the position exists
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not in the board");
		}
		
		return piece(position) != null;
	}
}
