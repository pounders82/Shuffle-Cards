import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Pounders82 on 10/27/15.
 */
public class ShuffleCards extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new HBox(10);

        //Creates an Array List with the size of 52 like a deck of cards
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 1; i<=52; i++){
            cards.add(i);

        }
        //Rearranges the order of the numbers in the cards Array List
        java.util.Collections.shuffle(cards);

        //Displays the first 3 cards in the deck
        Image image1 = new Image("card/"+ cards.get(0)+".png");
        pane.getChildren().add(new ImageView(image1));

        Image image2 = new Image("card/"+ cards.get(1)+".png");
        pane.getChildren().add(new ImageView(image2));
        Image image3 = new Image("card/"+ cards.get(2)+".png");
        pane.getChildren().add(new ImageView(image3));




        Scene scene = new Scene(pane);
        primaryStage.setTitle("Shuffle Cards");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
