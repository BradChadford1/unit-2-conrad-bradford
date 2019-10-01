import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.*;
public class FirstFX extends Application {
  public void start (Stage stage){
    Polygon stopSign = new Polygon();
    stopSign.getPoints().addAll(new Double[] {
      50.0, 0.0,
      100.0, 0.0,
      125.0, 25.0,
      125.0, 75.0,
      100.0, 100.0,
      50.0, 100.0,
      25.0, 75.0,
      25.0, 25.0,
    });
    Translate translation = new Translate(125, 110);
    //stopSign.getTransforms().addAll(translation);

    Text message = new Text(27.5, 62.5, "STOP");
    message.setFont(new Font(40.0));

    stopSign.setStrokeWidth(5);
    stopSign.setStroke(Color.WHITE);
    stopSign.setFill(Color.RED);
    message.setFill(Color.WHITE);

    Group root = new Group(stopSign, message);
    Scene scene = new Scene(root, 300, 120, Color.LIGHTBLUE);


    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
