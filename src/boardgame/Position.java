package boardgame;

public class Position {

	//Variables
	private int row;
	private int column;
	
	//Constructor using Fields
	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}
	
	//Getters and Setters
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	//To string
	@Override
	public String toString() {
		return row + ", " + column;
		
	}
	
	
}
