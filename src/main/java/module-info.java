module com.example.dictionaryenvi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.dictionaryenvi to javafx.fxml;
    exports com.example.dictionaryenvi;
}