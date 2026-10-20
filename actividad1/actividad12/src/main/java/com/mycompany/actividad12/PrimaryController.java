package com.mycompany.actividad12;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtDinero;
    @FXML private TextArea txtresultado;
    @FXML private TextArea txtRes;
    
    public void initialize(){
        txtRes.setText("- billetes de 500\n-billetes de  $200\n-billetes de $100\n"
                + "-billetes de  $50\n-billetes de $20\n-moneda de  $10\n-moneda de  $5\n"
                + "-moneda de  $2\n"+ "-moneda de  $1\n");
        
    }
    @FXML private void desglosarDinero() { 
        String textousu = txtDinero.getText();
        int monto = Integer. parseInt(textousu);
        
        int b500 = monto /500;
        monto = monto%500;
         int b200 = monto /200;
        monto = monto%200;
         int b100 = monto /100;
        monto = monto%100;
         int b50 = monto /50;
        monto = monto%50;
         int b20 = monto /20;
        monto = monto%20;
         int mon10 = monto /10;
        monto = monto%10;
         int mon5 = monto /5;
        monto = monto%5;
         int mon2 = monto /2;
        monto = monto%2;
        
        int mon1 = monto;
        
        String resultado = "";

        if (b500 > 0) resultado +=  b500 + "\n";
        if (b200 > 0) resultado += b200 + " \n";
        if (b100 > 0) resultado +=   b100 + " \n";
        if (b50 > 0)  resultado +=  b50  + " \n";
        if (b20 > 0)  resultado +=  +b20  + " \n";
        if (mon10 > 0)  resultado +=   mon10  + " \n";
        if (mon5 > 0)   resultado +=  mon5   + " \n";
        if (mon2 > 0)   resultado +=  mon2   + " \n";
        if (mon1 > 0)   resultado += mon1   + " \n";

        txtresultado.setText(resultado);
    }
    
    @FXML private void limpiarCampos() { 
    txtDinero.clear();
        txtresultado.clear();
    
    }
}
