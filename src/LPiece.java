import javafx.scene.paint.Color;
import java.util.ArrayList;

/**
 * Created by Lauren Oh on 5/19/2017.
 */
public class LPiece extends TetrisPiece
{
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

        this.cx = 140;
        this.cy = 130;
    }

    public LPiece(int centerx, int centery)
    {
        TetrisBlock p1 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx, centery);
        TetrisBlock p2 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx - 20, centery);
        TetrisBlock p3 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx - 20 , centery - 20);
        TetrisBlock p4 = new TetrisBlock(Color.LIGHTGREEN, 20, centerx - 20 , centery - 40);

        piece.add(p1);
        piece.add(p2);
        piece.add(p3);
        piece.add(p4);

        this.cx = centerx;
        this.cy = centery;
    }

    public void rotate(int dir)
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

}
