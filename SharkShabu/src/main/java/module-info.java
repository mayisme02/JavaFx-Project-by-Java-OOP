module com.example.sharkshabu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.sharkshabu to javafx.fxml;
    exports com.example.sharkshabu;
}