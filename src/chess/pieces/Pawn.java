package chess.pieces;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color, ChessMatch chessMatch) {
        super(board, color);
    }

    public String toString(){
        return "P";
    }
}
