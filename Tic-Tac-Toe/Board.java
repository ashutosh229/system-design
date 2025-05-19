import com.sun.tools.javac.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class Board{
    public int size;
    public PlayingPiece[][]board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }
    public boolean addPiece(int row,int col,PlayingPiece playingPiece){
        if (board[row][col] != null){
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }
    
}