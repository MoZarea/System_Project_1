module com.example.systems {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    requires org.kordamp.ikonli.javafx;
    requires java.net.http;


    opens com.example.systems11 to javafx.fxml;
    exports com.example.systems11;
}