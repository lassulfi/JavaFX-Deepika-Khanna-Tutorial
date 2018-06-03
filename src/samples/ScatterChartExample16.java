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
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class ScatterChartExample16 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Número de funcionários");
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Receita por funcionário");
        
        ScatterChart scatterChart = new ScatterChart(xAxis, yAxis);
        
        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2018");
        dataSeries1.getData().add(new XYChart.Data(1, 500));
        dataSeries1.getData().add(new XYChart.Data(5, 200));
        dataSeries1.getData().add(new XYChart.Data(10, 300));
        dataSeries1.getData().add(new XYChart.Data(80, 400));
        dataSeries1.getData().add(new XYChart.Data(100, 600));
        
        scatterChart.getData().add(dataSeries1);
        
        VBox vbox = new VBox(scatterChart);
        
        Scene scene = new Scene(vbox, 400, 400);
        
        primaryStage.setTitle("Exemplo de gráfico de dispersão");
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
