package assignment;

import javafx.scene.image.Image;

public class MainCharacter extends GameObject {
    private static final String IMAGE_PATH = "Image/preveena.png";

    private Image image;

    public MainCharacter() {
        this.image = new Image(getClass().getResourceAsStream(IMAGE_PATH));
    }

    public Image getImage() {
        return image;
    }
}