module com.example.upgrade {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.example.upgrade to javafx.fxml;
    exports com.example.upgrade;
}