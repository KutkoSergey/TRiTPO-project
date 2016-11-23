import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * Created by kutko on 23.11.2016.
 */
public class ModeRoot extends Pane {

    private RectangleButton backButton;
    private RectangleButton onePlayerButton;
    private RectangleButton twoPlayersButton1;
    private RectangleButton twoPlayersButton2;
    private VBox buttonLayout;
    private Image modeImage;
    private ImageView modeImageView;


    public ModeRoot(){

        modeImage = new Image(getClass().getResourceAsStream("BackgroundMenu.png"));
        modeImageView = new ImageView(modeImage);
        setPrefSize(980, 680);
        getChildren().add(modeImageView);

        onePlayerButton = new RectangleButton("Single player", Color.MAGENTA);
        twoPlayersButton1 = new RectangleButton("Multiplayer Mode 1", Color.YELLOW);
        twoPlayersButton2 = new RectangleButton("Multiplayer Mode 2", Color.BLUE);
        backButton = new RectangleButton("Back", Color.RED);

        backButton.setOnMouseClicked(event -> {
            Main.mainScene.setRoot(Main.menuRoot);
        });

        buttonLayout = new VBox();
        buttonLayout.setSpacing(20);
        buttonLayout.setTranslateY(330);
        buttonLayout.setTranslateX(630);
        buttonLayout.getChildren().addAll(onePlayerButton, twoPlayersButton1, twoPlayersButton2, backButton);
        getChildren().add(buttonLayout);
    }
}
