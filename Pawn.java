

public class Pawn extends Piece
{
    private boolean moveException;
     public Pawn(String c) {
         super(c);
    }
 
   
    public boolean isMoveValid(Pair start, Pair end)
    {
        if (moveException)
            return true;
        return Math.abs(end.getY() -start.getY()) <= 1 && start.getX() == end.getX();
            
    }
}
