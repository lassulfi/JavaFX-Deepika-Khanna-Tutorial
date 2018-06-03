/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class EventHandlingExample23 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField t1 = new TextField();
        t1.setOnKeyPressed((KeyEvent e) -> {
            System.out.println("Tecla pressionada: " + e.getText());
        });
        t1.setOnKeyReleased((KeyEvent e) -> {
            System.out.println("Tecla liberada: " + e.getText());
        });
        
        BorderPane bp = new BorderPane();
        bp.setTop(t1);
        
        Scene scene = new Scene(bp, 600, 600);
        
        primaryStage.setTitle("Exemplo de Eventos de Teclado");
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
