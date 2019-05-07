

public class Rook extends Piece
{
    private boolean moveException;
    public Rook(String color)
    {
         super(color);
    }

    public boolean isMoveValid(Pair start, Pair end)
    {
     if (moveException) 
        return true;
       return ( start.getX() == end.getX() && Math.abs(end.getY() - start.getY()) >= 1 ||
                start.getY() == end.getY() && Math.abs(end.getX() - start.getX()) >= 1);  
       
    }
}
