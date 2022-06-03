package Chess;

import Chess.pieces.*;
import boardgame.Board;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() { // retorna a matriz de peças
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];//intancio 64 posições no tabuleiro
		for(int i = 0; i<board.getRows(); i++) {
			for(int j = 0; j < board.getColumns();j++) {
				matriz[i][j] = (ChessPiece) board.piece(i,j); // downcasting
				
			}
		}
		return matriz;   
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	private void initialSetup() {
		placeNewPiece('y', 6, new Rook(board, Color.WHITE));
		

	}
}
