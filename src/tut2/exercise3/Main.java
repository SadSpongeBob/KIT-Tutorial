package tut2.exercise3;

class Main {
    void printRooks(Tile[][] tiles) {
        for (Tile[] row : tiles) {
            for (Tile tile : row) {
                Piece piece = tile.piece;
                if (piece.type == Type.ROOK) {
                    int x = tile.x;
                    int y = tile.y;
                    System.out.printf("(%s,%s)", x, y);
                }
            }
        }
    }
}
