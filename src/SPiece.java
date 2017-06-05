/**
 * Created by Lauren Oh on 5/26/2017.
 */
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class SPiece extends TetrisPiece
{
    public SPiece()
    {
        TetrisBlock pp1 = new TetrisBlock(Color.PURPLE, 20, 120, 140);
        TetrisBlock pp2 = new TetrisBlock(Color.PURPLE, 20, 140, 140);
        TetrisBlock pp3 = new TetrisBlock(Color.PURPLE, 20, 120, 160);
        TetrisBlock pp4 = new TetrisBlock(Color.PURPLE, 20, 100, 160);

        piece.add(pp1);
        piece.add(pp2);
        piece.add(pp3);
        piece.add(pp4);

        cx = 120;
        cy = 140;
    }

    public SPiece(int centerx, int centery)
    {
        TetrisBlock p1 = new TetrisBlock(Color.PURPLE, 20, centerx, centery);
        TetrisBlock p2 = new TetrisBlock(Color.PURPLE, 20, centerx, centery + 20);
        TetrisBlock p3 = new TetrisBlock(Color.PURPLE, 20, centerx + 20 , centery);
        TetrisBlock p4 = new TetrisBlock(Color.PURPLE, 20, centerx - 20 , centery + 20);

        piece.add(p1);
        piece.add(p2);
        piece.add(p3);
        piece.add(p4);

        cx = centerx;
        cy = centery;
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

}

