package assignment;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class StoryCollectionPage extends GameApp {
    private Stage primaryStage;

    public StoryCollectionPage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void show() {
        primaryStage.setTitle("Pacman Game - Story Collection");
        primaryStage.setScene(createScene());
        primaryStage.show();
    }

    private Scene createScene() {
        // Create scene for story collection page
        return null;
    }
}