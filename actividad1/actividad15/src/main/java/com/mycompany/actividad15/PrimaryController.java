package com.mycompany.actividad15;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtalimentos;
    @FXML private TextField txtrefrigerios;
    @FXML private TextField txttransporte;
    @FXML private TextField txttelefonia;
    @FXML private TextField txtotros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtingresardinero;
    @FXML
    private void calculartodo() {
        // 1. Convertir los textos a tipo double
        double alimentos = Double.parseDouble(txtalimentos.getText());
        double refrigerios = Double.parseDouble(txtrefrigerios.getText());
        double transporte = Double.parseDouble(txttransporte.getText());
        double telefonia = Double.parseDouble(txttelefonia.getText());
        double otros = Double.parseDouble(txtotros.getText());
        double total = alimentos + refrigerios + transporte + telefonia + otros;
        txtTotal.setText(String.valueOf(total));
        double mayor = alimentos;
        String concepto = "Alimentos";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            concepto = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            concepto = "Transporte";
        }
        if (telefonia > mayor) {
            mayor = telefonia;
            concepto = "Telefonía";
        }
        if (otros > mayor) {
            mayor = otros;
            concepto = "Otros";
        }
        txtingresardinero.setText(concepto);
    }

    @FXML
    private void limpiartodo() {
        txtalimentos.clear();
        txtrefrigerios.clear();
        txttransporte.clear();
        txttelefonia.clear();
        txtotros.clear();
        txtTotal.clear();
        txtingresardinero.clear();
    }
}
