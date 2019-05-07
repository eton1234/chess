

class Board 
{
    // instance variables - replace the example below with your own
    private Square[][] board = new Square[8][8];   //create new board
    Piece [] theRemoved = new Piece[32];           
    int x;
    public Board()
    {
        x = 0;
        
       
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                 board[x][y] = new Square();
            }
        }
        initializePieces();
        displayBoard();
    }
    
    public void removePiece (Pair location){
        int xCor = location.getX();   
        int yCor = location.getY();
        theRemoved[x] = board[7-yCor][xCor].getContents(); //add to list of removed
        x++;                
        board[7-yCor][xCor].setContents(null);//null);             //remove it from board
        displayBoard();
    }
    
    public void movePiece (Pair start, Pair end) {
        int sX = start.getX();
        int sY = start.getY();  
        int eX = end.getX();
        int eY = end.getY();
        Piece pInQuestion = getSquare(sX,sY).getContents();    //temporary piece
          if (pInQuestion.isMoveValid(start,end)) {   //is it Valid to justthat PIece? not necessarily
               removePiece(start);                    // if it's valid in context of other pieces
               getSquare(eX,eY).setContents(pInQuestion);
          }     
          displayBoard();
    }
    public Square getSquare (int x, int y) {
        return board[7-y][x]; // array board is y-axis flipped and x and y are mixed up from coordinate plane
    }
    public void displayBoard() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(board[x][y].getContents() + ",");
            }
            System.out.println();
        }
    }
    public void initializePieces() {
        for ( int i = 0; i<2; i++) {
            int h=0; 
            String c = "white";
            if (i==1) {
                h = 7;
                c = "black"; }
            getSquare(0,h).setContents(new Rook(c));
            getSquare(1,h).setContents(new Knight(c));
            getSquare(2,h).setContents(new Bishop(c));
            getSquare(3,h).setContents(new Queen(c));
            getSquare(4,h).setContents(new King(c));
            getSquare(5,h).setContents(new Bishop(c));
            getSquare(6,h).setContents(new Knight(c));
            getSquare(7,h).setContents(new Rook(c));
            for (int x = 0; x < 8; x++) {
                if (h== 7) { h = h-2;}
                board[h+1][x].setContents(new Pawn(c)); 
                
            }
                
        }
    }
    
}
