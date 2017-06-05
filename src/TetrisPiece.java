import java.util.ArrayList;

/**
 * Created by Lauren Oh on 6/5/2017.
 */
public abstract class TetrisPiece
{
    public ArrayList<TetrisBlock> piece = new ArrayList<TetrisBlock>();
    public int cx;
    public int cy;

    public void moveleft()
    {
        for (int i = 0; i < 4; i++)
        {
            TetrisBlock a = piece.get(i);
            a.move(-20, 0);
            piece.set(i, a);
        }
    }

    public void moveright()
    {
        for (int i = 0; i < 4; i++)
        {
            TetrisBlock a = piece.get(i);
            a.move(20, 0);
            piece.set(i, a);
        }
    }

    public abstract void rotate(int dir);
    public ArrayList<TetrisBlock> getpiece()
    {
        return piece;
    }

}
