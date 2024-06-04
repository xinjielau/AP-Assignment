package assignment;

import java.util.ArrayList;
import java.util.Random;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GamePage extends GameApp {
    private Stage primaryStage;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int CELL_SIZE = 40;
    private static final int NUM_ENEMIES = 6;
    private static final int HIT_POINTS_LOST = 5;
    private static final int HIT_POINTS_THRESHOLD = 3;
    private static final int GAME_OVER_POINTS_LOST = 50;

    private int playerX = 10;
    private int playerY = 10;

    private int[] enemyX = new int[NUM_ENEMIES];
    private int[] enemyY = new int[NUM_ENEMIES];
    private int[] enemyDX = new int[NUM_ENEMIES];
    private int[] enemyDY = new int[NUM_ENEMIES];

    private Random random = new Random();

    private boolean gameOver = false;
    private int marksCollected = 0;
    private int hitsTaken = 0;
    private MainCharacter mainCharacter;

    public GamePage(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.mainCharacter = new MainCharacter();
    }

    public void show() {
        primaryStage.setTitle("Pacman Game - Game Page");
        primaryStage.setScene(createScene());
        primaryStage.show();
        startGameLoop();
    }

    private Scene createScene() {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Pane root = new Pane(canvas);

        Image playerImage = mainCharacter.getImage();

        Label marksLabel = new Label("Marks Collected: 0");
        marksLabel.setLayoutX(WIDTH - 150);
        marksLabel.setLayoutY(20);
        root.getChildren().add(marksLabel);

        return new Scene(root, WIDTH, HEIGHT);
    }

    private void startGameLoop() {
        // Game loop implementation
    }
}
