import javafx.animation.Animation;
import javafx.animation.FillTransition;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * Created by kutko on 22.11.2016.
 */
public class RectangleButton extends StackPane {

    Rectangle rectangle;
    Text nameButton;

    public RectangleButton(String name, Color color){
        rectangle = new Rectangle(300, 65, Color.WHITE);
        rectangle.setOpacity(0.5);

        nameButton = new Text(name);
        nameButton.setFill(Color.BLACK);
        nameButton.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        setAlignment(Pos.CENTER);
        getChildren().addAll(rectangle, nameButton);
        FillTransition ft = new FillTransition(Duration.seconds(0.5), rectangle);
        setOnMouseEntered(event->{
            ft.setFromValue(Color.DARKGRAY);
            ft.setToValue(Color.DARKGOLDENROD);
            ft.setToValue(color);
            ft.setCycleCount(Animation.INDEFINITE);
            ft.setAutoReverse(true);
            ft.play();
        });

        setOnMouseExited(event->{
            ft.stop();
            rectangle.setFill(Color.WHITE);
        });
    }
}
