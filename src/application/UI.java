package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;

public class UI {
	
		
	public static ChessPosition readChessPosition(Scanner sc) {
		
		try {
		String s = sc.nextLine();
		char column = s.charAt(0);
		int row = Integer.parseInt(s.substring(1));
		return new ChessPosition(row, column);
		}
		catch (RuntimeException e) {
			throw new InputMismatchException("Posi��o inv�lida! Valores validos de a1 � h8");
		}
	}
	
	
	public static void printBoard(ChessPiece[][] pieces) {
		
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8-i) + " ");
			for(int j = 0; j < pieces.length; j++) {
				
				printPiece(pieces[i][j]);
				
			}
			System.out.println();
		}
		
		System.out.print("   a  b  c  d  e  f  g  h");
		
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print(" -");
		}
		else {
			
			if (piece.getColor() == Color.WHITE) {
                System.out.print( piece + "W");
            }
            else {
                System.out.print(piece + "B");
            }
		}
		System.out.print(" ");
	}
}
