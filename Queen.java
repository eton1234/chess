
public class Queen extends Piece
{
    private boolean moveException;
    public Queen(String c)
    {
         super(c);
    }
    
    //combined rook ability and bishop ability
    
    public boolean isMoveValid(Pair start, Pair end)
    {
          if (moveException) 
        return true;
      return(Math.abs(end.getX() - start.getX())== Math.abs(end.getY() - start.getY())|| 
             ( start.getX() == end.getX() && Math.abs(end.getY() - start.getY()) >= 0 ||
               start.getY() == end.getY() && Math.abs(end.getX() - start.getX()) >= 0 ));
            
                
            
    }
}
