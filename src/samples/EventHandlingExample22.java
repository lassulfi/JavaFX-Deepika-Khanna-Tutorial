/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class EventHandlingExample22 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Tipo de evento");
        
        Circle circle = new Circle(100, 300, 175);
        circle.setFill(Color.YELLOW);
        circle.setStrokeWidth(5);
        circle.setOnMouseEntered((MouseEvent e) -> {
            lbl.setText("O mouse entrou no circulo");
            circle.setFill(Color.RED);
        });
        circle.setOnMouseExited((MouseEvent e) -> {
            lbl.setText("O mouse saiu do circulo");
            circle.setFill(Color.YELLOW);
        });
        circle.setOnMousePressed((MouseEvent e) ->{
            lbl.setText("O mouse foi pressionado");
            circle.setFill(Color.GREEN);
        });
        circle.setOnMouseReleased((MouseEvent e) -> {
            lbl.setText("Tipo de Evento");
            circle.setFill(Color.YELLOW);
        });
        
        BorderPane bp = new BorderPane();
        bp.setTop(lbl);
        bp.setCenter(circle);
        
        Scene scene = new Scene(bp, 700, 700);
        
        primaryStage.setTitle("Exemplo de eventos com mouse");
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
