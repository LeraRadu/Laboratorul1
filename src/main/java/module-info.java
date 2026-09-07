module com.example.laboratorul1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.laboratorul1 to javafx.fxml;
    exports com.example.laboratorul1;
}