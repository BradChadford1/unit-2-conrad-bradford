import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.*;
import javafx.scene.shape.Circle;

public class Snow extends Application {
  public void start (Stage stage) {
    Circle butt = new Circle(125, 125, 25);
    butt.setFill(Color.WHITE);
    butt.setStrokeWidth(1);
    butt.setStroke(Color.BLACK);
    Circle torso = new Circle(125, 95, 15);
    torso.setFill(Color.WHITE);
    torso.setStrokeWidth(1);
    torso.setStroke(Color.BLACK);
    Circle head = new Circle(125, 75, 10);
    head.setFill(Color.WHITE);
    head.setStrokeWidth(1);
    head.setStroke(Color.BLACK);
    Circle leftEye = new Circle(122.5, 72.5, 2);
    leftEye.setFill(Color.BLACK);
    Circle rightEye = new Circle(127.5, 72.5, 2);
    rightEye.setFill(Color.BLACK);
    Circle nose = new Circle(125, 77.5, 3);
    nose.setFill(Color.ORANGE);
    Rectangle leftArm = new Rectangle();
    leftArm.setX(85);
    leftArm.setY(92.5);
    leftArm.setWidth(25);
    leftArm.setHeight(2);
    leftArm.setFill(Color.web("#512D00"));
    Rectangle rightArm = new Rectangle();
    rightArm.setX(140);
    rightArm.setY(92.5);
    rightArm.setWidth(25);
    rightArm.setHeight(2);
    rightArm.setFill(Color.web("#512D00"));
    Rectangle hatRim = new Rectangle();
    hatRim.setX(112.5);
    hatRim.setY(60);
    hatRim.setWidth(25);
    hatRim.setHeight(7.5);
    hatRim.setFill(Color.BLACK);
    Rectangle topHat = new Rectangle();
    topHat.setX(117.5);
    topHat.setY(40);
    topHat.setWidth(15);
    topHat.setHeight(25);
    topHat.setFill(Color.BLACK);

    Rectangle ground = new Rectangle();
    ground.setX(0);
    ground.setY(140);
    ground.setWidth(300);
    ground.setHeight(75);
    ground.setFill(Color.WHITE);
    ground.setStroke(Color.BLACK);
    ground.setStrokeWidth(1);
    Group landscape = new Group(ground);
    Group face = new Group(hatRim, topHat, leftEye, rightEye, nose);
    Group snowman = new Group(butt, torso, head, leftArm, rightArm);
    Group root = new Group(snowman, face, landscape);
    Scene winterWonderland = new Scene(root, 300, 200, Color.LIGHTBLUE);

    stage.setTitle("Winter Wonderland");
    stage.setScene(winterWonderland);
    stage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }
}
