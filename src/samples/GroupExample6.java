/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class GroupExample6 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button b1 = new Button("Botão 1");
        Button b2 = new Button("Botão 2");
        
        Group group = new Group();
        group.getChildren().addAll(b1, b2);
        
        Scene scene = new Scene(group, 400, 500);
       
        primaryStage.setTitle("Group Layout Example");
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
