package com.example.Calcolatrice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class Calcolatrice extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        Di fatto il tipo di dato FXMLLoader e quindi la sua relativa variabile fxmlloader serve a prendere il file fxml
        con l'interfaccia grafica e a metterlo come scene alla partenza dell'applicazione. Inoltre sempre FXMLLoader
        crea un instanza del relatico controller (in questo caso CalcolatriceControllerGrafico), in particolare
        attraverso intialize hai la possibilità di dare dei valori agli attributi dell'istanza (una sorta di costruttore)
         */
        System.out.println("Scegli versione calcolatrice");
        System.out.println("1) Versione classica");
        System.out.println("2) Versione alternativa");
        String versione;
        int opzione=Input.readInt();
        if(opzione==2){
             versione="calcolatriceAlternativa.fxml";
        }
        else{
            versione="calcolatriceNormale.fxml";
        }
        FXMLLoader fxmlLoader = new FXMLLoader(Calcolatrice.class.getResource(versione));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}