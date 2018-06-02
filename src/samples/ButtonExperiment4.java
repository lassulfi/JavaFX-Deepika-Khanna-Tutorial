/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class ButtonExperiment4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");

        //Spacer
        Region spacer = new Region();
        
        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox hbox = new HBox();
        hbox.getChildren().addAll(btn1, btn2, spacer, btn3);
        hbox.setMargin(btn1, new Insets(10));
        hbox.setMargin(btn2, new Insets(10));
        hbox.setMargin(btn3, new Insets(10));

        Scene scene = new Scene(hbox, 500, 500);
        
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
