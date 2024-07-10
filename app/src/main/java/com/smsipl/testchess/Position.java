package com.smsipl.testchess;

import com.smsipl.testchess.Pieces.Piece;

/**
 * Created by DIPANSH KHANDELWAL on 03-06-2017
 */

public class Position {
    private Piece piece;


    Position(Piece piece ) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;

    }

    void setPiece(Piece piece) {
        this.piece = piece;
    }

}
