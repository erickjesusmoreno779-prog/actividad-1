module com.mycompany.actividad12 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.actividad12 to javafx.fxml;
    exports com.mycompany.actividad12;
}
