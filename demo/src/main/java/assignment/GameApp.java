package assignment;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GameApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        HomePage homePage = new HomePage(primaryStage);
        homePage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}