/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class BorderPaneExample7 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button("Arquivos");
        Button btn2 = new Button("Menu");
        Button btn3 = new Button("Novo");
        Button btn4 = new Button("Salvar");
        Button btn5 = new Button("Sair");
        
        BorderPane bp = new BorderPane();
        bp.setCenter(btn1);
        bp.setTop(btn2);
        bp.setRight(btn3);
        bp.setBottom(btn4);
        bp.setLeft(btn5);
        
        Scene scene = new Scene(bp, 400, 400);
        
        primaryStage.setTitle("BorderPane Layout");
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
