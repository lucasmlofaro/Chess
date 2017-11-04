package pieces;

public class Pawn extends Piece {
    public Pawn() {
        super("p");
    }

    public Pawn(Color color) {
        this();
        this.color = color;
    }
}
