
public class Square
{
    // instance variables - replace the example below with your own
    private int color;
    private Piece contents;
    
    public Square()
    {
        //color = 0;
        //contents = new Rook();
        
    }
    public Piece getContents(){
        return contents;
    }
    public void setContents(Piece piece) {
      contents = piece;
    }
    //public String displaySquare() {
      //  }
}
