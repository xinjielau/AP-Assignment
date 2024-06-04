module assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens assignment to javafx.fxml;
    exports assignment;
}
