/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class VBoxLayoutExample5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button("Botão um");
        btn1.setMaxWidth(Double.MAX_VALUE);
        Button btn2 = new Button("Botão dois");
        btn2.setMaxWidth(Double.MAX_VALUE);
        Button btn3 = new Button("Botão três");
        btn3.setMaxWidth(Double.MAX_VALUE);
        
        VBox vbox = new VBox(20);
//        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().addAll(btn1, btn2, btn3);
        
        Scene scene = new Scene(vbox, 400, 400);
        
        primaryStage.setTitle("VBox Layout");
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
