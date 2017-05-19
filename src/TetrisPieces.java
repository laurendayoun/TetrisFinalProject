/**
 * Created by ohl4928 on 5/9/2017.
 */

import javafx.scene.Scene;
import javafx.application.Application;
import java.util.ArrayList;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class TetrisPieces extends Application {
    public void start(Stage primaryStage)
    {
        Horizontal H = new Horizontal();
        ArrayList<TetrisBlock> a = H.getpiece();

        Block B = new Block(20,20);
        ArrayList<TetrisBlock> b = B.getpiece();

        LPiece L = new LPiece(100, 60);
        ArrayList<TetrisBlock> l = L.getpiece();

        Pane root = new Pane();

        for (int n = 0; n < 4; n++)
        {
            root.getChildren().addAll(a.get(n), b.get(n), l.get(n));
        }

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Piece1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args)
    {
        launch(args);
    }
}
