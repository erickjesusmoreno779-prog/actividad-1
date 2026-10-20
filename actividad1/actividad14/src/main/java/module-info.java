module com.mycompany.actividad14 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.actividad14 to javafx.fxml;
    exports com.mycompany.actividad14;
}
