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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class GridLayout9 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");
        Button btn4 = new Button("Botão 4");
        Button btn5 = new Button("Botão 5");
        Button btn6 = new Button("Botão 6");
        Button btn7 = new Button("Botão 7");
        Button btn8 = new Button("Botão 8");
        Button btn9 = new Button("Botão 9");
        
        GridPane gp = new GridPane();
        gp.setMinSize(400, 200);
        gp.setPadding(new Insets(10));
        gp.setHgap(15);
        gp.setVgap(15);
        gp.add(btn1, 0, 0);
        gp.add(btn2, 1, 0);
        gp.add(btn3, 2, 0);
        gp.add(btn4, 0, 1);
        gp.add(btn5, 1, 1);
        gp.add(btn6, 2, 1);
        gp.add(btn7, 0, 2);
        gp.add(btn8, 1, 2);
        gp.add(btn9, 2, 2);
        
        Scene scene = new Scene(gp, 400, 200);
        
        primaryStage.setTitle("GridPane Layout");
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
