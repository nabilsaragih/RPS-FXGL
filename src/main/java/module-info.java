module org.example.rpsfxgl {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens org.example.rpsfxgl to javafx.fxml;
    exports org.example.rpsfxgl;
}