import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kutko on 22.11.2016.
 */
public class RulesRoot extends Pane {

    private RectangleButton backToMainButton;
    private Image menuImage;
    private ImageView menuImageView;
    private TextArea rulesTextArea;
    private File rulesFile;
    private String rulesTextSrtring;


    public RulesRoot (){

        menuImage = new Image(getClass().getResourceAsStream("BackgroundRules.png"));
        menuImageView = new ImageView(menuImage);
        setPrefSize(980, 680);
        getChildren().add(menuImageView);

        backToMainButton = new RectangleButton("Back", Color.DEEPSKYBLUE);
        backToMainButton.setOnMouseClicked(event -> {
            Main.mainScene.setRoot(Main.menuRoot);
        });
        backToMainButton.setTranslateY(610);
        backToMainButton.setTranslateX(340);
        this.getChildren().add(backToMainButton);

        rulesTextArea = new TextArea();
        rulesTextArea.setMinSize(920, 550);
        rulesTextArea.setTranslateY(45);
        rulesTextArea.setTranslateX(40);
        rulesTextArea.setStyle("-fx-font-family: Consolas;" +
                "-fx-font-size: 18;" + "-fx-text-fill: deepskyblue;"
                + "-fx-display-caret:true;");

        rulesFile =new File("Rules.txt");
        char[] bufferForRules = new char[(int)rulesFile.length()];
        try( FileReader reader = new FileReader(rulesFile)){
            bufferForRules = new char[(int)rulesFile.length()];
            reader.read(bufferForRules);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        rulesTextSrtring = new String (bufferForRules);
        rulesTextArea.setText(rulesTextSrtring);
        getChildren().add(rulesTextArea);

    }
}
