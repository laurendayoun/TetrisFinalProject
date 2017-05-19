import javafx.scene.paint.Color;

import java.util.ArrayList;

/**
 * Created by Lauren Oh on 5/19/2017.
 */
public class Block
{
    public ArrayList<TetrisBlock> piece = new ArrayList<TetrisBlock>();

    public Block()
    {
        TetrisBlock pp1 = new TetrisBlock(Color.RED, 20, 120, 140);
        TetrisBlock pp2 = new TetrisBlock(Color.RED, 20, 140, 140);
        TetrisBlock pp3 = new TetrisBlock(Color.RED, 20, 120, 120);
        TetrisBlock pp4 = new TetrisBlock(Color.RED, 20, 140, 120);

        piece.add(pp1);
        piece.add(pp2);
        piece.add(pp3);
        piece.add(pp4);
    }

    public Block(int centerx, int centery)
    {
        TetrisBlock p1 = new TetrisBlock(Color.RED, 20, centerx + 10, centery + 10);
        TetrisBlock p2 = new TetrisBlock(Color.RED, 20, centerx - 10, centery + 10);
        TetrisBlock p3 = new TetrisBlock(Color.RED, 20, centerx + 10 , centery - 10);
        TetrisBlock p4 = new TetrisBlock(Color.RED, 20, centerx - 10 , centery - 10);

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
