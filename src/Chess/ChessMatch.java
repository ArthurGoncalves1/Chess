package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
	public Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() { // retorna a matriz de peças
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];//intancio 64 posições no tabuleiro
		for(int i = 0; i<board.getRows(); i++) {
			for(int j = 0; i < board.getColumns();i++) {
				matriz[i][j] = (ChessPiece) board.piece(i,j); // downcasting
			}
		}
		return matriz;
	}
	
	private void initialSetup() { //Coloca as pecas no tabuleiro
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color .BLACK), new Position(0, 4));
	}
}
