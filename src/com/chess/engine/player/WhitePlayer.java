package com.chess.engine.player;

<<<<<<< HEAD
import java.util.Collection;
=======
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
>>>>>>> 0e8745abf5099f0afcd72c6b106d5dc93c416393

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
<<<<<<< HEAD
import com.chess.engine.pieces.Piece;

public class WhitePlayer extends Player {

	public WhitePlayer(Board board, Collection<Move> legalMoves, Collection<Move> opponentMoves) {
		super(board, legalMoves, opponentMoves);
		// TODO Auto-generated constructor stub
=======
import com.chess.engine.board.Move.KingSideCastleMove;
import com.chess.engine.board.Move.QueenSideCastleMove;
import com.chess.engine.board.Tile;
import com.chess.engine.pieces.Piece;
import com.chess.engine.pieces.Rook;

public class WhitePlayer extends Player {

	public WhitePlayer(final Board board, final Collection<Move> legalMoves, final Collection<Move> opponentMoves) {
		super(board, legalMoves, opponentMoves);
>>>>>>> 0e8745abf5099f0afcd72c6b106d5dc93c416393
	}

	@Override
	public Collection<Piece> getActivePieces() {
		return this.board.getWhitePieces();
	}

	@Override
	public Alliance getAlliance() {
		return Alliance.WHITE;
	}
<<<<<<< HEAD

=======
	
>>>>>>> 0e8745abf5099f0afcd72c6b106d5dc93c416393
	@Override
	public Player getOpponent() {
		return this.board.blackPlayer();
	}

<<<<<<< HEAD
}
=======
	@Override
	protected Collection<Move> calculateKingCastles(final Collection<Move> playerLegals, final Collection<Move> opponentLegals) {
		final List<Move> kingCastles = new ArrayList<>();
		
		if (this.playerKing.isFirstMove() && !this.isInCheck()) {
			if (!this.board.getTile(61).isTileOccupied() && !this.board.getTile(62).isTileOccupied()) {
				final Tile rookTile = this.board.getTile(63);
				
				if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()) {
					if (Player.calculateAttacksOnTile(61, opponentLegals).isEmpty() &&
						Player.calculateAttacksOnTile(62, opponentLegals).isEmpty() &&
						rookTile.getPiece().getPieceType().isRook()) {
						
						kingCastles.add(new KingSideCastleMove(this.board, 
																	this.playerKing,
																	62, 
																	(Rook) rookTile.getPiece(), 
																	rookTile.getTileCoordinate(), 
																	61));
					}
				}
			}
			
			if (!this.board.getTile(59).isTileOccupied() && 
				!this.board.getTile(58).isTileOccupied() && 
				!this.board.getTile(57).isTileOccupied()) {
				
				final Tile rookTile = this.board.getTile(56);
				if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove() &&
					Player.calculateAttacksOnTile(58, opponentLegals).isEmpty() &&
					Player.calculateAttacksOnTile(59, opponentLegals).isEmpty() &&
					rookTile.getPiece().getPieceType().isRook()) {
					
					kingCastles.add(new QueenSideCastleMove(this.board, 
															this.playerKing,
															58, 
															(Rook) rookTile.getPiece(), 
															rookTile.getTileCoordinate(), 
															59));
				}
			}
		}
		
		return kingCastles;
	}

}	
>>>>>>> 0e8745abf5099f0afcd72c6b106d5dc93c416393
