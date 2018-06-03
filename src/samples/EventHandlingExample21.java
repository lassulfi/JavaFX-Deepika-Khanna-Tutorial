/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class EventHandlingExample21 extends Application {
    
    //Atributos
    private int count = 0;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Clique aqui!");
        btn.setOnAction((ActionEvent e ) -> {
            count++;
            System.out.println("Número de cliques: " + count);
        });
        
        BorderPane bp = new BorderPane();
        bp.setCenter(btn);
        
        Scene scene = new Scene(bp, 500, 500);
        
        primaryStage.setTitle("Exemplo de Eventos do Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
