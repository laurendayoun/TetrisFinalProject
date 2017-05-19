import javafx.scene.paint.Color;
import java.util.ArrayList;
import javafx.scene.shape.Rectangle;

/**
 * Created by ohl4928 on 5/15/2017.
 */
public class Horizontal
{
    public ArrayList<TetrisBlock> piece = new ArrayList<TetrisBlock>();

    public Horizontal()
    {
        TetrisBlock p1 = new TetrisBlock(Color.AQUA, 20, 80, 120);
        TetrisBlock p2 = new TetrisBlock(Color.AQUA, 20, 100, 120);
        TetrisBlock p3 = new TetrisBlock(Color.AQUA, 20, 120, 120);
        TetrisBlock p4 = new TetrisBlock(Color.AQUA, 20, 140, 120);

        piece.add(p1);
        piece.add(p2);
        piece.add(p3);
        piece.add(p4);
    }

    public Horizontal(int centerx, int centery)
    {
        TetrisBlock p1 = new TetrisBlock(Color.AQUA, 20, centerx + 10, centery + 10);
        TetrisBlock p2 = new TetrisBlock(Color.AQUA, 20, centerx + 30, centery + 10);
        TetrisBlock p3 = new TetrisBlock(Color.AQUA, 20, centerx - 10, centery + 10);
        TetrisBlock p4 = new TetrisBlock(Color.AQUA, 20, centerx - 30, centery + 10);

        piece.add(p1);
        piece.add(p2);
        piece.add(p3);
        piece.add(p4);
    }

    public ArrayList<TetrisBlock> getpiece()
    {
        return piece;
    }

}
