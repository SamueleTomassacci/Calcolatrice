package com.example.Calcolatrice;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CalcolatriceAlternativaControllerGrafico implements Initializable {
    @FXML
    private Label risultato;
    @FXML
    private TextField op1;
    @FXML
    private TextField operatore;
    @FXML
    private TextField op2;
    @FXML
    private Button button ;
    private CalcolatriceControllerApplicativo controller;
    public void initialize(URL location, ResourceBundle resources) {
        this.controller=new CalcolatriceControllerApplicativo();
    }
    @FXML
    public void calcola(){

       String meta=controller.componiOperazione(this.op1.getText(),this.operatore.getText());
       String operazione=controller.componiOperazione(meta,this.op2.getText());
       String result=controller.calcolaOperazione(operazione);
       this.risultato.setText(result);
    }


}
