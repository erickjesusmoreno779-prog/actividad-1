module com.mycompany.actividad13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.actividad13 to javafx.fxml;
    exports com.mycompany.actividad13;
}
