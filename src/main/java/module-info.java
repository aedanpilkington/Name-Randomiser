module com.example.namerandomiser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.namerandomiser to javafx.fxml;
    exports com.example.namerandomiser;
}