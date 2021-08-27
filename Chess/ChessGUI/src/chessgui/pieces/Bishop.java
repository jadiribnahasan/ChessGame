package chessgui.pieces;

import chessgui.Board;

public class Bishop extends Piece {

    public Bishop(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: For attacking or just moving, a bishop is allowed to move 
        // as many squares diagonally as it wants without jumping over another 
        // piece. He cannot attack his own pieces.
        
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
        
        if(Math.abs(destination_x - this.getX()) != Math.abs(destination_y - this.getY())){
            
            return false;
        }
        
        return true;
    }
}
