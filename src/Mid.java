import javafx.scene.paint.Color;

import java.util.ArrayList;

/**
 * Created by Lauren Oh on 5/19/2017.
 */
public class Mid
{
    public ArrayList<TetrisBlock> piece = new ArrayList<TetrisBlock>();
    public int cx;
    public int cy;

    public Mid()
    {
        TetrisBlock pp1 = new TetrisBlock(Color.LIGHTBLUE, 20, 120, 140);
        TetrisBlock pp2 = new TetrisBlock(Color.LIGHTBLUE, 20, 100, 140);
        TetrisBlock pp3 = new TetrisBlock(Color.LIGHTBLUE, 20, 140, 140);
        TetrisBlock pp4 = new TetrisBlock(Color.LIGHTBLUE, 20, 120, 120);

        piece.add(pp1);
        piece.add(pp2);
        piece.add(pp3);
        piece.add(pp4);

        cx = 120;
        cy = 140;
    }

    public Mid(int centerx, int centery)
    {
        TetrisBlock p1 = new TetrisBlock(Color.LIGHTBLUE, 20, centerx, centery);
        TetrisBlock p2 = new TetrisBlock(Color.LIGHTBLUE, 20, centerx - 20, centery);
        TetrisBlock p3 = new TetrisBlock(Color.LIGHTBLUE, 20, centerx + 20 , centery);
        TetrisBlock p4 = new TetrisBlock(Color.LIGHTBLUE, 20, centerx, centery - 20);

        piece.add(p1);
        piece.add(p2);
        piece.add(p3);
        piece.add(p4);

        cx = centerx;
        cy = centery;
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

    public void rotate()
    {
        for (int i = 0; i < 4; i++)
        {
            TetrisBlock a = piece.get(i);
            int x = cx + cy - a.gety();
            int y = cy - cx + a.getx();
            int dx = x - a.getx();
            int dy = y - a.gety();
            a.move(dx, dy);
            piece.set(i, a);
        }
    }

    public ArrayList<TetrisBlock> getpiece()
    {
        return piece;
    }
}
