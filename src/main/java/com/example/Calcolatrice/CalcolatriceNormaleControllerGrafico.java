package com.example.Calcolatrice;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

/*Controller grafico, ha come attributi i vari bottini e label, gestisce l'interazione dell'utente con la grafica
inviando i dati da lavorare al controller applicativo con cui è in associazione, infatti ha un attributo proprio di
tipo CalcolatriceControllerApplicativo che viene istanziato attraverso initialize.
 */
public class CalcolatriceNormaleControllerGrafico implements Initializable{
    @FXML
    private Label risultato;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button per;
    @FXML
    private Button slash;
    @FXML
    private Button uguale;
    private CalcolatriceControllerApplicativo controller;
    private int count;

    public void initialize(URL location, ResourceBundle resources) {
        this.controller=new CalcolatriceControllerApplicativo();
        this.count=1;
    }

    @FXML
    protected void clickButton(ActionEvent event){
        Button button=(Button)event.getSource();
        if(count==0){
            String esistente=risultato.getText();
            String daAggiungere=button.getText();
            String risultatoStr;
            risultatoStr=this.controller.componiOperazione(esistente,daAggiungere);
            risultato.setText(risultatoStr);
        }
        else{
            risultato.setText(button.getText());
            this.count=0;
        }

    }

    @FXML
    protected void clickUguale(){
        count=1;
        String valore=this.controller.calcolaOperazione(risultato.getText());
        risultato.setText(valore);

    }

}
