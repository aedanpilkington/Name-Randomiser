module com.example.namerandomiser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.namerandomiser to javafx.fxml;
    exports com.example.namerandomiser;
}