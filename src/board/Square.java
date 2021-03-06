package board;

import pieces.Piece;

public class Square {
    private final File file;
    private final Rank rank;
    private Piece piece;

    public Square(File file, Rank rank, Piece piece) {
        this.file = file;
        this.rank = rank;
        this.piece = piece;
    }

    public Square(File file, Rank rank) {
        this(file, rank, null);
    }

    public int getFile() {
        return this.file.ordinal();
    }

    public int getRank() {
        return this.rank.ordinal();
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void clearPiece() {
        this.piece = null;
    }

    public String toString() {
        String r = rank.toString();
        String f = file.toString();
        return f.substring(f.length() - 1).toLowerCase() + r.substring(r.length() - 1);
    }
}
