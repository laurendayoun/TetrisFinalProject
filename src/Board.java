import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Lauren Oh on 6/5/2017.
 */

public class Board
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
            //piece.movedown;
            this.addpiece(piece);
        }

    }

    public void rotate(TetrisPiece piece1, TetrisPiece piece2, int dir)
    {
        piece1.rotate(dir);
        if (this.canmove(piece1, 0, 0))
        {
            this.removepiece(piece2);
            this.addpiece(piece1);
        }
    }

    public boolean canmove(TetrisPiece piece, int hori, int verti)
    {
        ArrayList<TetrisBlock> parts = piece.getpiece();
        for (TetrisBlock block : parts)
        {
            int x=  hori + block.getx()/20;
            int y = verti + block.gety()/20;
            if (grid[x][y] == 1)
            {
                return false;
            }
        }
        return true;
    }

}
