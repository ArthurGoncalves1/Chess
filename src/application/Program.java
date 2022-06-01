package application;

import Chess.ChessMatch;


public class Program {

	public static void main(String[] args) {

		ChessMatch cm = new ChessMatch();
		
		UI.printBoard(cm.getPieces()); //user interface imprime o tabuleiro com as pecas
		
		
		//cm.getPieces();
		
	}

}
