package boardgame;

public class Position {
	
	/*
	 * encapsulamento
	 * construtores
	 * to String
	 */
	
	private int row;
	private int column;
	
	public Position() {
		super();
	}
	//construtor com argumentos
	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}
	//getters e setters
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
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
