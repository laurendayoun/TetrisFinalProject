import javafx.scene.paint.Color;
import java.util.ArrayList;
import javafx.scene.shape.Rectangle;

/**
 * Created by ohl4928 on 5/15/2017.
 */
public class Horizontal
{
    public ArrayList<TetrisBlock> piece = new ArrayList<TetrisBlock>();
    public int cx;
    public int cy;

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

        cx = 100;
        cy = 120;
    }

    public Horizontal(int centerx, int centery)
    {
        TetrisBlock p1 = new TetrisBlock(Color.AQUA, 20, centerx, centery);
        TetrisBlock p2 = new TetrisBlock(Color.AQUA, 20, centerx + 20, centery);
        TetrisBlock p3 = new TetrisBlock(Color.AQUA, 20, centerx - 20, centery);
        TetrisBlock p4 = new TetrisBlock(Color.AQUA, 20, centerx + 40, centery);

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

    public void rotate(int dir)
    {
        for (int i = 0; i < 4; i++)
        {
            TetrisBlock a = piece.get(i);
            int x = cx - dir*cy + dir*a.gety();
            int y = cy + dir*cx - dir*a.getx();
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
