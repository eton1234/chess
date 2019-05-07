public class Knight extends Piece
{
    private boolean moveException;
    public Knight(String color)
    {
       super(color);
    }

    public boolean isMoveValid(Pair start, Pair end)
    {
          if (moveException) 
        return true;
        return false;
    }
}
