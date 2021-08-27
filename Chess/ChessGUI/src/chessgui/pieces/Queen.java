package chessgui.pieces;

import chessgui.Board;

public class Queen extends Piece {

    public Queen(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: A Queen can move as many squares as she wants forward, 
        // backward, sideways, or diagonally, without jumping over any pieces.
        // She cannot attack her own pieces.
        
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
        
        if((Math.abs(destination_x - this.getX()) != Math.abs(destination_y - this.getY())) && (this.getX()!= destination_x && this.getY()!= destination_y)){
            
            return false;
        }
        return true;
    }
}
