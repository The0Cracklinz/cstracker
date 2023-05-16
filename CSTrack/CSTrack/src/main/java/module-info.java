module com.example.cstrack {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.cstrack to javafx.fxml;
    exports com.example.cstrack;
}