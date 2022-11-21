import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    /*
        *This is the main method
        *This a runner game 
    */
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        Gamescene theScene = new Gamescene(pane,800,400,true);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
}
