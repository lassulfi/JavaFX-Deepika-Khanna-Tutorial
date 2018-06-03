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
public class EventHandling21 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Clique aqui!");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Olá mundo!");
        });
        
        BorderPane bp = new BorderPane();
        bp.setCenter(btn);
        
        Scene scene = new Scene(bp, 500, 500);
        
        primaryStage.setTitle("Eventos em JavaFX");
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
