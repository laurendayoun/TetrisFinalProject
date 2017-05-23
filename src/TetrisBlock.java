
/**
 * Created by ohl4928 on 5/11/2017.
 */
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TetrisBlock extends Rectangle
{
    public int xp;
    public int yp;

    public TetrisBlock()
    {
        super();
    }

    public TetrisBlock(Color clr, int side, int x1, int y1)
    {
        super.setX(x1);
        xp = x1;
        yp = y1;
        super.setY(y1);
        super.setHeight(side);
        super.setWidth(side);
        super.setStroke(Color.BLACK);
        super.setStrokeWidth(1.3);
        super.setFill(clr);
    }

    public int getx()
    {
        return xp;
    }

    public int gety()
    {
        return yp;
    }



    public void move(int x, int y)
    {
        xp += x;
        yp += x;

        this.setX(xp);
        this.setY(yp);
    }

}