package com.mycompany.actividad13;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNum;
    @FXML private TextField txtCantC;
    @FXML private TextField txtCifrasPar;
    @FXML private TextField txtCifrasImp;
    @FXML private TextField txtCifrasTot;
    @FXML private TextField txtCifraMay;
    @FXML private TextField txtCifraMen;
    @FXML private TextArea txtResultado;

    @FXML 
    private void analisis() {
        String texto = txtNum.getText();

        int sumaPares = 0;
        int sumaImpares = 0;
        int mayor = Character.getNumericValue(texto.charAt(0));
        int menor = Character.getNumericValue(texto.charAt(0));

        for (int i = 0; i < texto.length(); i++) {
            int digito = Character.getNumericValue(texto.charAt(i));

            if (digito % 2 == 0) {
                sumaPares += digito;
                
            } else {
                sumaImpares += digito;
                
            }

            if (digito > mayor) {
                mayor = digito;
                
            }
            if (digito < menor) {
                menor = digito;
                
            }
        }

        int total = sumaPares + sumaImpares;
        int cantidadCifras = texto.length();

        txtCantC.setText(String.valueOf(cantidadCifras));
        
        txtCifrasPar.setText(String.valueOf(sumaPares));
        
        txtCifrasImp.setText(String.valueOf(sumaImpares));
        
        txtCifrasTot.setText(String.valueOf(total));
        
        txtCifraMay.setText(String.valueOf(mayor));
        
        txtCifraMen.setText(String.valueOf(menor));

        int numeroCompleto = Integer.parseInt(texto);
        String divisoresText = "";

        for (int i = 1; i <= numeroCompleto; i++) {
            
            if (numeroCompleto % i == 0) {
                
                divisoresText += i + "\n";
                
            }
        }

        txtResultado.setText(divisoresText);
    }

   
    @FXML
    private void limpiarCampos() {
        txtNum.clear();
        txtCantC.clear();
        txtCifrasPar.clear();
        txtCifrasImp.clear();
        txtCifrasTot.clear();
        txtCifraMay.clear();
        txtCifraMen.clear();
        txtResultado.clear();
    }
}
