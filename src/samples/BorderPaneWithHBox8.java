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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class BorderPaneWithHBox8 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button("Arquivos");
        Button btn2 = new Button("Menu");
        Button btn3 = new Button("Novo");
        Button btn4 = new Button("Salvar");
        Button btn5 = new Button("Sair");
        
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(btn1, btn2, btn3);
        hbox1.setSpacing(5);
        hbox1.setPadding(new Insets(5));
        
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(btn4, btn5);
        
        BorderPane bp = new BorderPane();
        bp.setTop(hbox1);
        bp.setBottom(hbox2);
        hbox2.setSpacing(5);
        hbox2.setPadding(new Insets(5));
        
        Scene scene = new Scene(bp, 400, 400);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane com HBox");
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
