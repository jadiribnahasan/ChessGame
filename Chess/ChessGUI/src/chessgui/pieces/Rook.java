package chessgui.pieces;

import chessgui.Board;

public class Rook extends Piece {

    public Rook(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: A rook can move as many squares as he wants either forward,
        // backward, or sideways without jumping any pieces. He cannot attack
        // his own pieces.
        
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
        
        if(this.getX()!= destination_x && this.getY()!= destination_y){
            
            return false;
        }
        
        //string 
        
        return true;
    }
}
