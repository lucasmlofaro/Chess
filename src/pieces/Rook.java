package pieces;

public class Rook extends Piece {
    public Rook() {
        super("r");
    }

    public Rook(Color color) {
        this();
        this.color = color;
    }
}
