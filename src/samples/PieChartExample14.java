/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class PieChartExample14 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        PieChart piechart = new PieChart();
        PieChart.Data slice1 = new PieChart.Data("Desktop", 213);
        PieChart.Data slice2 = new PieChart.Data("Telefone", 60);
        PieChart.Data slice3 = new PieChart.Data("Tablet", 36);
        
        piechart.getData().addAll(slice1, slice2, slice3);
        
        VBox vbox = new VBox(piechart);
        
        Scene scene = new Scene(vbox, 300, 400);
        
        primaryStage.setTitle("Exemplo gráfico pizza");
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
