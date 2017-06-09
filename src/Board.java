import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Lauren Oh on 6/5/2017.
 */

public class Board extends Pane
{
    public int[][] grid;

    public Board()
    {
        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 480);
        grid = new int[15][24];
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 24; j++)
            {
                grid[i][j] = 0;
            }
        }
    }

    public Board(int height, int width)
    {
        Pane root = new Pane();
        Scene scene = new Scene(root, width, height);
        grid = new int[width/20][height/20];
        for (int i = 0; i < width/20; i++)
        {
            for (int j = 0; j < height/20; j++)
            {
                grid[i][j] = 0;
            }
        }
    }

    public void addpiece(TetrisPiece piece)
    {
        ArrayList<TetrisBlock> parts = piece.getpiece();
        for (TetrisBlock block : parts)
        {
            int x = block.getx()/20;
            int y = block.gety()/20;
            grid[x][y] = 1;
        }
    }

    public void removepiece(TetrisPiece piece)
    {
        ArrayList<TetrisBlock> parts = piece.getpiece();
        for (TetrisBlock block : parts)
        {
            int x = block.getx()/20;
            int y = block.gety()/20;
            grid[x][y] = 0;
        }
    }

    public void moveleft(TetrisPiece piece)
    {
        if (this.canmove(piece, -1, 0))
        {
            this.removepiece(piece);
            piece.moveleft();
            this.addpiece(piece);
        }

    }

    public void moveright(TetrisPiece piece)
    {
        if (this.canmove(piece, 1, 0))
        {
            this.removepiece(piece);
            piece.moveright();
            this.addpiece(piece);
        }
    }

    public void movedown(TetrisPiece piece)
    {
        if (this.canmove(piece, 0,1))
        {
            this.removepiece(piece);
            piece.movedown();
            this.addpiece(piece);
        }

    }

    public void rotate(TetrisPiece piece1,  int dir)
    {
        ArrayList<TetrisBlock> parts = piece1.getpiece();
        for (int i = 0; i < 4; i++)
            {
                TetrisBlock a = parts.get(i);
                int x = piece1.getcx() - dir*piece1.getcy() + dir*a.gety();
                int y = piece1.getcy() + dir*piece1.getcx() - dir*a.getx();
                int dx = x - a.getx();
                int dy = y - a.gety();
                if (this.canmoveblock(a, dx, dy))
                {
                    continue;
                }

            }

            this.removepiece(piece1);
            piece1.rotate(dir);
            this.addpiece(piece1);
    }

    public boolean canmove(TetrisPiece piece, int hori, int verti)
    {
        ArrayList<TetrisBlock> parts = piece.getpiece();
        for (TetrisBlock block : parts)
        {
            int x = hori + block.getx()/20;
            int y = verti + block.gety()/20;
            if (x < 0 || x > 15 || y < 0 || y > 24)
            {
                return false;
            }
            if (grid[x][y] == 1)
            {
                return false;
            }
        }
        return true;
    }

    public boolean canmoveblock(TetrisBlock b, int hori, int verti)
    {
        int x = hori/20 + b.getx()/20;
        int y = verti/20 + b.gety()/20;

        if (x < 0 || x > 15 || y < 0 || y > 24)
        {
            return false;
        }

        if (grid[x][y] == 1)
        {
            return false;
        }

        return true;
    }

    public boolean IsRowFull(int row)
    {
        for (int i = 0; i < 15; i++)
        {
            if (grid[i][row] == 0)
            {
                continue;
            }

            else
            {
                return true;
            }
        }

        return false;
    }

    public void clearrow()
    {
        if ()
    }

}
