
public abstract class Piece
{
    protected String color;
    
    public Piece(String color)
    {
       this.color = color;
    }
    public abstract boolean isMoveValid(Pair start, Pair end);
    public String getColor() {
         return this.color;
    }
    public void setColor (String color) {
        this.color = color;
    
    }
}
