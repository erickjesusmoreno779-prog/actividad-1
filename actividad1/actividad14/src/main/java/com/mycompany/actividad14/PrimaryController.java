package com.mycompany.actividad14;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtTexusu;
    @FXML private TextArea txtRes;

    @FXML 
    private void calcularTabla() { 
        String texto = txtTexusu.getText();
        int num = Integer.parseInt(texto);
        String tablaAcumulada = "";
        
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            tablaAcumulada += num + " x " + i + " = " + resultado + "\n";
        }
        txtRes.setText(tablaAcumulada);
    } 

    @FXML 
    private void LimpiarTodo() { // <-- Mismo nombre que en el FXML (con 'L' mayúscula)
        txtTexusu.clear();
        txtRes.clear();
    }
} 
