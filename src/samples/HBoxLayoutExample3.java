/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class HBoxLayoutExample3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(btn1, btn2, btn3);
        //hbox.setPadding(new Insets(20));
        //hbox.setSpacing(20);
        hbox.setMargin(btn1, new Insets(50));
        hbox.setMargin(btn2, new Insets(50));
        hbox.setMargin(btn3, new Insets(50));
        
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
