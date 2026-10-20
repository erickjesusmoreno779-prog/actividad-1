module com.mycompany.actividad15 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.actividad15 to javafx.fxml;
    exports com.mycompany.actividad15;
}
