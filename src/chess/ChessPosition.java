package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(int row,char column) {
		
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro ao instanciar o ChessPosition. Valores válidos de a1 até h8");
		}

		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	public Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	public static ChessPosition fromPosition(Position position) {
		return new ChessPosition( 8-position.getRow(), (char)('a' - position.getColumn()));
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
