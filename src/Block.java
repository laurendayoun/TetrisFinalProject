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
        TetrisBlock p1 = new TetrisBlock(Color.RED, 20, centerx, centery);
        TetrisBlock p2 = new TetrisBlock(Color.RED, 20, centerx - 20, centery);
        TetrisBlock p3 = new TetrisBlock(Color.RED, 20, centerx , centery - 20);
        TetrisBlock p4 = new TetrisBlock(Color.RED, 20, centerx - 20 , centery - 20);

        piece.add(p1);
        piece.add(p2);
        piece.add(p3);
        piece.add(p4);
    }

    public void rotate()
    {
        piece = piece;
    }

    public void moveleft()
    {
        for (int i = 0; i < 4; i++)
        {
            TetrisBlock a = piece.get(i);
            a.move(20, 0);
            piece.set(i, a);
        }
    }

    public void moveright()
    {
        for (int i = 0; i < 4; i++)
        {
            TetrisBlock a = piece.get(i);
            a.move(-20, 0);
            piece.set(i, a);
        }
    }

    public ArrayList<TetrisBlock> getpiece()
    {
        return piece;
    }
}
