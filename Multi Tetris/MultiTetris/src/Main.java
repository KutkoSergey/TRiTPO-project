import com.sun.javafx.sg.prism.NGShape;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by kutko on 21.11.2016.
 */
public class Main extends Application {

    public static Scene mainScene;
    public static MenuRoot menuRoot;
    public static RulesRoot rulesRoot;
    public static ModeRoot modeRoot;

    public void start(Stage primaryStage){

        menuRoot = new MenuRoot();
        rulesRoot = new RulesRoot();
        modeRoot = new ModeRoot();

        mainScene = new Scene(menuRoot);
        mainScene.getStylesheets().add("TextBackgroundArea.css");

        primaryStage.setScene(mainScene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Tetris");
        primaryStage.show();
    }

    public static void main(String [] args){
        launch(args);
    }

}
