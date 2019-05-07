
public class King extends Piece
{
    private boolean moveException;
    public King(String c)
    {
        super(c);
    }
   
    
   //since King can only move up to one out in any direction
   //pair is an object that has an x and a y
   public boolean isMoveValid(Pair start, Pair end)
   {
       if (moveException) 
            return true; 
       return (Math.abs(end.getY()-start.getY()) <= 1 && Math.abs(end.getX()-start.getX()) <= 1);
   }
}
