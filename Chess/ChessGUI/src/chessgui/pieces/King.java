package chessgui.pieces;

import chessgui.Board;

public class King extends Piece {

    public King(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: a king can move one square up, right, left, or down, or
        // diagonally, but he can never put himself in danger of an oposing 
        // piece attacking him on the next turn. He cannot attack his own pieces.
        
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
        int a = Math.abs(this.getX() - destination_x);
        int b = Math.abs(this.getY() - destination_y);
        
        if(((a == 1) && (b == 1))){
            return true;
        }
        else{return false;}
        
        return true;
    }
}
