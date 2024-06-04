package assignment;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HomePage extends GameApp {
    private Stage primaryStage;

    public HomePage(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
    }

    public void show() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene sc = new Scene(root);
        primaryStage.setTitle("Pacman Game - Home");
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}