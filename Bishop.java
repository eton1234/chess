import java.lang.*;
public class Bishop extends Piece
{
   private boolean moveException;
   public Bishop(String c)
    {
        super(c);
    }

   public boolean isMoveValid(Pair start, Pair end)
   {
         if (moveException) 
        return true;
        return (Math.abs(end.getX() - start.getX())== Math.abs(end.getY() - start.getY()));
   }
}
