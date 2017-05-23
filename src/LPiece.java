import javafx.scene.paint.Color;
import java.util.ArrayList;

/**
 * Created by Lauren Oh on 5/19/2017.
 */
public class LPiece
{
    public ArrayList<TetrisBlock> piece = new ArrayList<TetrisBlock>();

    public LPiece()
    {
        TetrisBlock pp1 = new TetrisBlock(Color.LIGHTGREEN, 20, 120, 140);
        TetrisBlock pp2 = new TetrisBlock(Color.LIGHTGREEN, 20, 140, 140);
        TetrisBlock pp3 = new TetrisBlock(Color.LIGHTGREEN, 20, 120, 120);
        TetrisBlock pp4 = new TetrisBlock(Color.LIGHTGREEN, 20, 120, 100);

        piece.add(pp1);
        piece.add(pp2);
        piece.add(pp3);
        piece.add(pp4);
    }

    public LPiece(int centerx, int centery)
    {
        TetrisBlock p1 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx + 10, centery + 10);
        TetrisBlock p2 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx - 10, centery + 10);
        TetrisBlock p3 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx - 10 , centery - 10);
        TetrisBlock p4 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx - 10 , centery - 30);

        piece.add(p1);
        piece.add(p2);
        piece.add(p3);
        piece.add(p4);
    }

    public void rotate()
    {
        for (int i = 0; i < 4; i++)
        {
            TetrisBlock a = piece.get(i);
            int dx = 2*a.getx() - a.gety();
            int dy = 2*a.gety() - a.getx();
            a.move(dx, dy);
            piece.set(i, a);
        }
    }

    public ArrayList<TetrisBlock> getpiece()
    {
        return piece;
    }
}
