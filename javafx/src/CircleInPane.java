import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleInPane extends Application {
    @Override
    public void start(Stage primaryStage) {

        Circle circle = new Circle(50, Color.RED);


        Pane pane = new Pane(circle);
        Scene scene = new Scene(pane, 400, 400);


        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}