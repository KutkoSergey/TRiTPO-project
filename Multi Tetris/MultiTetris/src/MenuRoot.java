import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * Created by kutko on 21.11.2016.
 */
public class MenuRoot extends Pane {

    private RectangleButton exitButton;
    private RectangleButton rulesButton;
    private RectangleButton statisticsButton;
    private RectangleButton startGameButton;
    private VBox buttonLayout;
    private Image menuImage;
    private ImageView menuImageView;

    public MenuRoot(){

        menuImage = new Image(getClass().getResourceAsStream("BackgroundMenu.png"));
        menuImageView = new ImageView(menuImage);
        setPrefSize(980, 680);
        getChildren().add(menuImageView);

        startGameButton = new RectangleButton("Start game", Color.RED);
        rulesButton = new RectangleButton("Rules", Color.DEEPSKYBLUE);
        statisticsButton = new RectangleButton("Statistics", Color.GREENYELLOW);
        exitButton = new RectangleButton("Exit", Color.PURPLE);

        startGameButton.setOnMouseClicked(event->{
            Main.mainScene.setRoot(Main.modeRoot);
        });

        rulesButton.setOnMouseClicked(event -> {
           Main.mainScene.setRoot(Main.rulesRoot);
        });

        statisticsButton.setOnMouseClicked(event -> {
            Main.mainScene.setRoot(Main.statisticsRoot);
        });

        exitButton.setOnMouseClicked(event -> {
            System.exit(0);
        });

        buttonLayout = new VBox();
        buttonLayout.setSpacing(20);
        buttonLayout.setTranslateY(330);
        buttonLayout.setTranslateX(630);
        buttonLayout.getChildren().addAll(startGameButton, rulesButton, statisticsButton, exitButton);
        getChildren().add(buttonLayout);
    }
}
