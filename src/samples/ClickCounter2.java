/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class ClickCounter2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button();
        btn.setText("Clique aqui!");
        
        Label lbl = new Label();
        lbl.setText("Você ainda não clicou no botão!");
        
        //Layout: BorderPane
        BorderPane bp = new BorderPane();
        bp.setTop(lbl);
        bp.setCenter(btn);
        //bp.setBottom(btn);
        
        Scene scene = new Scene(bp, 250, 150);
        
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
