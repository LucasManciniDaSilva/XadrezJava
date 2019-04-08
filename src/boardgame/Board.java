package boardgame;

public class Board {

	//Variables
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Constructor using Fields
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Method to return rows and columns
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//Method to return rows and columns from a position
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
