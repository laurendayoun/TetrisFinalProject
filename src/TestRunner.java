/**
 * Created by Lauren Oh on 5/23/2017.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class TestRunner extends Application
{
    @Override
    public void start(Stage primaryStage)
    {

        Button btn = new Button();
        btn.setText("->");

        Horizontal H = new Horizontal();
        ArrayList<TetrisBlock> a = H.getpiece();

        Block B = new Block(20,20);
        ArrayList<TetrisBlock> b = B.getpiece();

        LPiece L = new LPiece(100, 60);
        ArrayList<TetrisBlock> l = L.getpiece();

        Mid F = new Mid(180, 80);
        ArrayList<TetrisBlock> f = F.getpiece();

        Pane root = new Pane();

        for (int n = 0; n < 4; n++)
        {
            root.getChildren().addAll(a.get(n), b.get(n), l.get(n), f.get(n));
        }

        root.getChildren().add(btn);



        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            int dir = -1;
            public void handle(ActionEvent event)
            {
                B.moveleft();
                L.rotate(dir);
                F.moveright();

                dir = -1*dir;
            }
        });

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Testing!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args)
    {
        launch(args);
    }

}
