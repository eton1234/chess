
public class test
{
   public test() {
        
        Board board = new Board();
        board.movePiece(new Pair(0,0),new Pair (0,1)); // rook;
        // board.movePIece(new Pair(1,0),new Pair(2,4);
        board.movePiece(new Pair (2,0), new Pair (5,3));
        board.movePiece(new Pair (3,0), new Pair(3,3)); //foward 2
        board.movePiece (new Pair (3,3), new Pair (4,2));
        board.movePiece (new Pair (7,1), new Pair (7,2));
        board.displayBoard();
    
    }
}
