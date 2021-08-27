package chessgui.pieces;

import chessgui.Board;

public class Knight extends Piece {

    public Knight(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: a knight can move in any L shape and can jump over anyone
        // in order to do so. He cannot attack his own pieces.
        // By an L shape, I mean it can move to a square that is 2 squares away
        // horizontally and 1 square away vertically, or 1 square away horizontally
        // and 2 squares away vertically.
        // some examples:
        //
        //  * *       * * *           *       *
        //  *             *       * * *       *
        //  *                                 * *
            
                // WRITE CODE HERE
        Piece possiblePiece = board.getPiece(destination_x , destination_y);
        
        if(possiblePiece != null){
            
            if(possiblePiece.isWhite() && this.isWhite()){
                
                return false;
            }
            if(possiblePiece.isBlack() && this.isBlack()){
                
                return false;
            }
        }
        if(this.getX() == destination_x || this.getY() == destination_y){
            return false;
        }
        
        int a = Math.abs(this.getX() - destination_x);
        int b = Math.abs(this.getY() - destination_y);
        if(a == 1 || a == 2 || b == 1 || b == 2){
            if((a == 1) && (b != 2)){
                return false;
            }
            if((a == 2) && (b != 1)){
                return false;
            }
            if((b == 1) && (a != 2)){return false;}
            if((b == 2) && (a != 1)){return false;}
            
        }
        else{
            return false;
        }
        
        return true;
    }
}
