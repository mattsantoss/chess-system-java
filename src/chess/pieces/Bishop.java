package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

import java.security.PublicKey;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "B";
    }
}
